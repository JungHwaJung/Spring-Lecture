package com.example.spring03.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring03.model.CustomerModel;

@Controller
@RequestMapping(value="/")
public class CustomerController {
	
	@RequestMapping(value="edit.do", method=RequestMethod.GET) 
	public ModelAndView edit() {
		ModelAndView model = new ModelAndView();
		CustomerModel customer = new CustomerModel();
		model.addObject("customer", customer);
		model.setViewName("edit");
		return model;
		
	}
}
