package com.kh.spring.board.model.service;

import java.util.List;

import com.kh.spring.board.model.vo.Board;

public interface BoardService {
	// 게시글 전체조회 + 페이징 처리
	
	// 현재 Board테이블의 총 행의 개수
	
	// 게시글 검색 기능 
	int searchCount();
	
	// 게시글 목록 조회
	List<Board> findAll();
	
	// 검색 목록 조회
	List<Board> searchAll();
	
	// 게시글 작성
	int insert(Board board);
	
	// 게시글 상세보기
	// 조회수 증가
	int increaseCount(int boardNo);
	//우선 시행 되어야함 - 실패할 수도 있음, 실패시 다음 작업 이뤄지지 않게
	//
	
	// 상세조회
	Board findById(int boardNo);
	
	// 게시글 삭제
	int delete(int boardNo);
	
	// 게시글 수정
	int update(Board board);
	// 댓글 (AJAX / MyBatis)

	int boardCount();
	
	// 댓글 작성
	
	//
}
