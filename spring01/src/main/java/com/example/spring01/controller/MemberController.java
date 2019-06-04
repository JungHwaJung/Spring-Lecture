package com.example.spring01.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring01.model.dto.MemberDTO;
import com.example.spring01.service.MemberService;

@Controller		//헌재 클래스를 controller bean으로 등록
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService memberService;
	
	@RequestMapping("/member/list.do")
	public String memberList(Model model) {
		logger.info("memberList 시작");
		List<MemberDTO> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/member_list";
	}
	
	@RequestMapping("/member/write.do")
	public String write() {
		logger.info("write() 시작");
		return "member/write";
	}
	
	// @ModelAttribute에 폼에서 입력하 데이터가 저장됨
	@RequestMapping("/member/insert.do")	//사용자가 요청한 주소
	public String insert(@ModelAttribute MemberDTO dto) {
		logger.info("insert() 시작");
		// @ModelAttribute MemberDTO dto 하면 일일이
		// request.getParameter로 값을 전달하지 않아도 됨
		memberService.insertMember(dto);
		return "redirect:/member/list.do";
		// 만약 redirect를 붙이지 않으면 forward가 되어 주소가 바뀌지 않음
	}
	
	@RequestMapping("/member/view.do")
	public String view(@RequestParam String userid, Model model) {
		logger.info("view() 시작");
		model.addAttribute("dto", memberService.viewMember(userid));
		return "member/view";
	}
	
	@RequestMapping("/member/update.do")
	public String update(@ModelAttribute MemberDTO dto, Model model) {
		//System.out.println("dto.getUserid() : " + dto.getUserid());
		//System.out.println("dto.getPasswd() : " + dto.getPasswd());
		boolean result= memberService.checkPw(dto.getUserid(), dto.getPasswd());
		logger.info("비밀번호 확인 : " + result);
		
		if(result) {	//비밀번호가 맞으면
			memberService.updateMember(dto);	//레코드 수정
			return "redirect:/member/list.do";
		} else {	//비밀번호가 틀리면
			MemberDTO dto2 = memberService.viewMember(dto.getUserid());
			dto.setJoin_date(dto2.getJoin_date());	//날짜가 지워지지 않도록
			model.addAttribute("dto", dto);
			model.addAttribute("message", "비밀번호가 일치하지 않습니다");
			return "member/view";	//수정페이지로 되돌아감
		}
	}
	
	@RequestMapping("/member/delete.do")
	public String delete(@ModelAttribute MemberDTO dto, Model model) {
		boolean result= memberService.checkPw(dto.getUserid(), dto.getPasswd());
		logger.info("비밀번호 확인 : " + result);
		
		if(result) {	
			memberService.deleteMember(dto.getUserid());
			return "redirect:/member/list.do";
		} else {	
			MemberDTO dto2 = memberService.viewMember(dto.getUserid());
			dto.setJoin_date(dto2.getJoin_date());	
			model.addAttribute("dto", dto);
			model.addAttribute("message", "비밀번호가 일치하지 않습니다");
			return "member/view";	
		}
	}
}
