package com.kh.spring.member.model.service;

import com.kh.spring.member.model.vo.Member;

public interface MemberService {

	int returnNum();
	
	Member login(Member member);
	
	int insert(Member member);
	
	int update(Member member);
	
	int delete(String userId);
	//아이디 중복체크(SELECT)
	int idCheck(String checkId);
	
	
	
	
	
}



