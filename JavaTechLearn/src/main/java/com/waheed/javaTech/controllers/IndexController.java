/**
 * 
 */
package com.waheed.javaTech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Waheed
 *
 */

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "welcome";
	}
	@GetMapping("/home")
	public String home() {
		return "home";
	}	

}
