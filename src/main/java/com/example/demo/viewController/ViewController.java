package com.example.demo.viewController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ViewController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("loginPage");
		return modelAndView;
	}
	
	@RequestMapping(value = "/api/api", method = RequestMethod.GET)
	public ModelAndView api() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("api/api");
		return modelAndView;
	}

}
