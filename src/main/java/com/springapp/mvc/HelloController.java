package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView printWelcome() {
		//model.addAttribute("message", "Hello world!");
		ModelAndView mav = new ModelAndView("base");
		mav.addObject("title", "This is title");
		return mav;
	}


}