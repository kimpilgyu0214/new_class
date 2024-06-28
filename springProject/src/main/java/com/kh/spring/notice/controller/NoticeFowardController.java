package com.kh.spring.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeFowardController {

	
	@GetMapping("notice")
	public String notices() {
		return "api/notice";
	}
	
	
	
	
}