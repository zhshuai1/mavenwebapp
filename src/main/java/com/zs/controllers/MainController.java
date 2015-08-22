package com.zs.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping(value = "/FirstWebApp/say", method = RequestMethod.GET)
	public String sayHello(@RequestParam("name") String id, Model model) {
		System.out.println(id);
		model.addAttribute("url", "world");
		return "test";
	}

	@RequestMapping(value = "/FirstWebApp/", method = RequestMethod.GET)
	public String index(Map<String, String> model) {
		System.out.println("hello");
		model.put("url", "456");
		return "index";
	}
}
