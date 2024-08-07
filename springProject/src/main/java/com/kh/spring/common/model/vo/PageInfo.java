package com.kh.spring.common.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class PageInfo {

	int listCount; 		// 현재 일반게시판의 게시글 총 개수 => Board테이블로부터 총 데이터 select count로 조회
	int currentPage;  	// 현재 페이지 (사용자가 요청한 페이지)
	int pageLimit; 		// 페이지 하단에 보여질 페이징바의 최대개수 => 10개로 고정 
	int boardLimit;		// 한 페이지에 보여질 게시글의 최대 개수 => 10개로 고정
	
	int maxPage;		// 가장 마지막 페이지가 몇 번 페이지인지 (총 페이지의 개수)
	int startPage;		// 페이지 하단에 보여질 페이징바의 시작 수
	int endPage;		// 페이지 하단에 보여질 페이징바의 끝 수
	
}
