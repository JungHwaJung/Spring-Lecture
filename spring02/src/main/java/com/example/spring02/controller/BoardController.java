package com.example.spring02.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring02.model.dto.BoardDTO;
import com.example.spring02.service.BoardService;


@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(AddressBookController.class);
	
	@Inject
	BoardService board;
	
	@RequestMapping("board/noticeboard.do")
	public String boardList(Model model) {
		logger.info("boardList() 시작");
		List<BoardDTO> list = board.boardList();
		model.addAttribute("list", list);
		return "board/noticeboard";
	}
	
	@RequestMapping(value = "nbwrite.do", method = RequestMethod.GET)
	public String nbwrite(Model model) {
		logger.info("게시판 글쓰기 페이지 시작");
		model.addAttribute("message", "게시판 글쓰기 화면입니다");
		return "board/nbwrite";
	}
	
	@RequestMapping(value = "detail.do", method = RequestMethod.GET)
	public String detailView(@RequestParam String userid, Model model) {
		logger.info("detailView() 시작");
		model.addAttribute("dto", board.viewBoard(userid));
		return "board/detail";
	}
}
