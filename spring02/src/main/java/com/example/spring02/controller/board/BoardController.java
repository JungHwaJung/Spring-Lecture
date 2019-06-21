package com.example.spring02.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Inject
	BoardService boardService;

	@RequestMapping("list.do")
	public ModelAndView list() throws Exception {
		List<BoardDTO> list = boardService.listAll(0, 0, "", "");		 //목록
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/list");			//이동할 페이지 지정
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);		//맴에 자료 저장
		mav.addObject("map", map);		//데이터 저장
		return mav;		//페이지 이동(출력)
	}
}
