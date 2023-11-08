package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class shopController {

	@GetMapping
	public String start() {
		return "redirect:shop/list";
	}
	@GetMapping("/shop/list")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("shop/shoplist");
		return modelAndView;
	}
}
