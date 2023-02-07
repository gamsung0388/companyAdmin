package com.test.admin.guide.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuideController {
	
	
	@GetMapping("/index")
	public String Intro() {
		return "/guide/index";
	}
	
	@GetMapping("/err")
	public String err() {
		return "/guide/error_page";
	}
	@GetMapping("/button")
	public String button() {
		return "/guide/buttons";
	}
	@GetMapping("/cards")
	public String cards() {
		return "/guide/cards";
	}
	@GetMapping("/color")
	public String colors() {
		return "/guide/utilities-color";
	}
	
	@GetMapping("/borders")
	public String borders() {
		return "/guide/utilities-border";
	}
	@GetMapping("/animations")
	public String animations() {
		return "/guide/utilities-animation";
	}
	@GetMapping("/other")
	public String other() {
		return "/guide/utilities-other";
	}
	@GetMapping("/login")
	public String login() {
		return "/guide/login";
	}
	@GetMapping("/register")
	public String register() {
		return "/guide/register";
	}
	@GetMapping("/forgot-password")
	public String forgot_password() {
		return "/guide/forgot-password";
	}
	@GetMapping("/blank")
	public String blank() {
		return "/guide/blank";
	}
	@GetMapping("/charts")
	public String charts() {
		return "/guide/charts";
	}
	@GetMapping("/tables")
	public String tables() {
		return "/guide/tables";
	}
}
