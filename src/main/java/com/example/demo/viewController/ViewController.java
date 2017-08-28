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
	
	@RequestMapping(value = "/api/angular", method = RequestMethod.GET)
	public ModelAndView getAngular() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("api/angular");
		return modelAndView;
	}
	
	@RequestMapping(value = "/bootstrap/login", method = RequestMethod.GET)
	public ModelAndView bootstrapLogin() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/bootstrap/login");
		return modelAndView;
	}
	
	@RequestMapping(value = "/loginGoogle", method = RequestMethod.GET)
	public ModelAndView loginGoogle() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/loginGoogle");
		return modelAndView;
	}

}
