package com.kh.spring.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring.board.model.service.BoardService;
import com.kh.spring.board.model.vo.Board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
// 이 컨트롤러는 /boards로 시작하는 요청이 들어오면 처리를 해줄 컨트롤러
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value="boards", produces="application/json; charset=UTF-8")
public class BoardsController {

		private final BoardService boardService;
	
		@GetMapping
		public List<Board> findTopFiveBoard() {
			
			return boardService.findTopFiveBoard();
		}
		
		
		
		@GetMapping("/{boardNo}")
		public Board findByBoardNo(@PathVariable int boardNo) {
			log.info("넘오온 pk : {}", boardNo);
			
			return boardService.findById(boardNo);
			
			
			
		}
		
	
}

