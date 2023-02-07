package com.test.admin.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class PageController {
	
	@GetMapping("/")
	public String mainpage() {
		
		log.info("메인페이지");
		
		return "/main/index";
	}
	
}
