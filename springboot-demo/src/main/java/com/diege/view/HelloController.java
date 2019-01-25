package com.diege.view;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController{
	
	@RequestMapping("/hello")
	public ModelAndView hello(){
		return new ModelAndView("hello");
	}
}