package com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProductController {

	@GetMapping(value = "/")
	public ModelAndView hello() {
		return new ModelAndView("welcome");
	}
	
}
