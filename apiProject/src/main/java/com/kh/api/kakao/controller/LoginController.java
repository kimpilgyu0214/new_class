package com.kh.api.kakao.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.api.kakao.servcie.KakaoService;


@Controller
public class LoginController {

	
	
	@Autowired
	private KakaoService kakaoService;

	@GetMapping("oauth")
	public String socialLogin(String code, HttpSession session) throws IOException, ParseException	{
		
		
		String accessToken = kakaoService.getToken(code);
		session.setAttribute("accessToken", accessToken);
		
		SocialMember sm = kakaoService.getUserInfo(accessToken);
		session.setAttribute("loginUser", sm);
		//System.out.println(code);
	
		return "redirect:login";
		
	}
		
	@GetMapping("logout")
	public void logout(HttpSession session) {	
		
		String accessToken = (String)session.getAttribute("accessToken");
		
		kakaoService.logout(accessToken);
		
		
		
	}
	
	
	
	
	
	
	
}
