package com.product.spring.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.product.spring.model.shop.service.ProductService;

@Controller
//@RequestMapping("/shop/product/*")	//공통적인 url
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Inject
	ProductService productService;
	
	/*@RequestMapping(value="/", method = RequestMethod.GET)
	public String main() {
		return "/include/filemenu";
	}*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Model model) {
		//Model : 데이터 담을 그릇, map(키, 값)
		model.addAttribute("message", "PRODUCT 페이지 입니다.");
		//model.addAttribute("변수", "값")
		return "main";
	}
	
	@RequestMapping("/shop/product/list.do")
	public ModelAndView list(ModelAndView mav) {
		logger.info("list시작");
		mav.setViewName("shop/product/product_list");		//이동할 페이지 이름
		mav.addObject("list", productService.listProduct());	//데이터 저장
		return mav;		//페이지 이동
	}
	
	@RequestMapping("/shop/product/detail.do")
	public String detaillist(@RequestParam int product_id, Model model) {
		logger.info("detaillist시작");
		//model.setViewName("shop/product/product_detaillist");		//이동할 페이지 이름
		//mav.addObject("dto", productService.datailProduct(product_id));	//데이터 저장
		
		model.addAttribute("dto", productService.datailProduct(product_id));
		return "shop/product/product_detaillist";		//페이지 이동
	}

}
