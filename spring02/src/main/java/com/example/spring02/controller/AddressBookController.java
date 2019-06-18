package com.example.spring02.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring02.model.dto.AddressBookDTO;
import com.example.spring02.service.AddressBookService;

@Controller
public class AddressBookController {
	private static final Logger logger = LoggerFactory.getLogger(AddressBookController.class);
	
	@Inject
	AddressBookService addressBookService;
	
	@RequestMapping("/address/list.do")
	public String addressBookList(Model model) {
		logger.info("addressBookList 시작");
		List<AddressBookDTO> list = addressBookService.addressBookList();
		model.addAttribute("list", list);
		return "address/addressbook_list";
	}
	
	@RequestMapping("/address/write.do")
	public String write(Model model) {
		logger.info("write() 시작");
		return "address/write";
	}
	
	// @ModelAttribute에 폼에서 입력한 데이터가 저장됨
	@RequestMapping("/address/insert.do")	//사용자가 요청한 주소
	public String insert(@ModelAttribute AddressBookDTO dto) {
		logger.info("insert() 시작");
		// @ModelAttribute AddressBookDTO dto 하면 일일이
		// request.getParameter로 값을 전달하지 않아도 됨
		addressBookService.insertAddressBook(dto);
		
		return "redirect:/address/list.do";
		// 만약 redirect를 붙이지 않으면 forward가 되어 주소가 바뀌지 않음
	}
	
	@RequestMapping("/address/view.do")
	public String view(@RequestParam String userid, Model model) {
		logger.info("view() 시작");
		model.addAttribute("dto", addressBookService.viewAddressBook(userid));
		return "address/view";
	}
	
	@RequestMapping("/address/noticeboard.do")
	public String noticeBoard(Model model) {
		logger.info("noticeBoard() 시작");
		return "address/noticeboard";
	}
	
	@RequestMapping("/address/update.do")
	public String update(@ModelAttribute AddressBookDTO dto, Model model) {
		//System.out.println("dto.getUserid() : " + dto.getUserid());
		//System.out.println("dto.getPasswd() : " + dto.getPasswd());
		boolean result= addressBookService.checkPw(dto.getUserid(), dto.getPasswd());
		logger.info("비밀번호 확인 : " + result);
		
		if(result) {	//비밀번호가 맞으면
			addressBookService.updateAddressBook(dto);	//레코드 수정
			return "redirect:/address/list.do";
		} else {	//비밀번호가 틀리면
			AddressBookDTO dto2 = addressBookService.viewAddressBook(dto.getUserid());
			dto.setJoin_date(dto2.getJoin_date());	//날짜가 지워지지 않도록
			model.addAttribute("dto", dto);
			model.addAttribute("message", "비밀번호가 일치하지 않습니다");
			return "address/view";	//수정페이지로 되돌아감
		}
	}
	
	@RequestMapping("/address/delete.do")
	public String delete(@ModelAttribute AddressBookDTO dto, Model model) {
		boolean result= addressBookService.checkPw(dto.getUserid(), dto.getPasswd());
		logger.info("비밀번호 확인 : " + result);
		
		if(result) {	
			addressBookService.deleteAddressBook(dto.getUserid());;
			return "redirect:/address/list.do";
		} else {	
			AddressBookDTO dto2 = addressBookService.viewAddressBook(dto.getUserid());
			dto.setJoin_date(dto2.getJoin_date());	
			model.addAttribute("dto", dto);
			model.addAttribute("message", "비밀번호가 일치하지 않습니다");
			return "address/view";	
		}
	}
}
