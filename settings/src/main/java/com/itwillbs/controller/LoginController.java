package com.itwillbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


	@RequestMapping("/login")
	public String loginGET() {
		return "login";
	}
	@RequestMapping("/signup")
	public String signupGET() {
		return "signup";
	}
	
}
