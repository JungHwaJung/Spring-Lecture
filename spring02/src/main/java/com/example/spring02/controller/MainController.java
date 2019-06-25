package com.example.spring02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	// URL pattern mapping 으로 get이나 post 방식 모두 사용 가능
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model) {
		//Model : 데이터 담을 그릇, map(키, 값)
		model.addAttribute("message", "저의 홈페이지 입니다.");
		//model.addAttribute("변수", "값")
		return "main";
	}
	
	@RequestMapping(value = "gugu.do", method = RequestMethod.GET)
	public String gugu(int dan, Model model) {
		logger.info("구구단 페이지 시작");
		String result="";
		for(int i=1; i<=9; i++) {
			result += dan + "X" + i + "=" + dan*i + "<br>";
		}
		model.addAttribute("result", result);
		return "test/gugu";
	}
	
	@RequestMapping(value="test", method = RequestMethod.GET)
	// 리턴타입이 void인 경우 RuquestMapping과 동일한 페이지로 이동합니다.
	public void test() {
		
	}
	
	@RequestMapping(value = "test/doA", method = RequestMethod.GET)
	public void doA(Model model) {
		logger.info("doA 시작");
		model.addAttribute("message", "doA 페이지입니다(메세지)");
		return;
	}
	
	@RequestMapping(value = "noticeboard.do", method = RequestMethod.GET)
	public String board(Model model) {
		logger.info("게시판 페이지 시작");
		model.addAttribute("message", "게시판 화면입니다");
		return "noticeboard";
	}
}
