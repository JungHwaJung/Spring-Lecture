package com.example.spring02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring02.model.dto.ProductDTO;

@RestController
public class SampleRestController {
	private static final Logger logger = LoggerFactory.getLogger(SampleRestController.class);
	@ResponseBody
	@RequestMapping("test/doB")
	public ProductDTO doB() {
		logger.info("ProductDTO doB() 시작");
		return new ProductDTO("냉장고", 500000);
	}
}
