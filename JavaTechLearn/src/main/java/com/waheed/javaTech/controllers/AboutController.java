package com.waheed.javaTech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

	@GetMapping("/About")
	public String about() {
		return "AboutScreen/About";
	}
}
