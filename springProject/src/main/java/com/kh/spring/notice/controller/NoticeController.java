package com.kh.spring.notice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring.notice.model.service.NoticeService;
import com.kh.spring.notice.model.vo.Message;
import com.kh.spring.notice.model.vo.Notice;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/notice")
@RestController
@RequiredArgsConstructor
public class NoticeController {


	private final NoticeService noticeService;
	
	
	@GetMapping
	public ResponseEntity<Message> findAll() {
		
		List<Notice> noticeList = noticeService.findAll();
		if(noticeList.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
										.body(Message.builder()
										.message("노 조회결과")
										.build());

		}
		log.info("조회된 공지사항 목록 : {}",noticeService);
		
		Message responseMsg = Message.builder()
									 .data(noticeList)
									 .message("예스 조회결과")
									 .build();
		
		return ResponseEntity.status(HttpStatus.OK).body(responseMsg);
	}
	
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Message> findById(@PathVariable int id){
		
		Notice notice = noticeService.findById(id);
		
		if(notice == null) {
			return ResponseEntity.status(HttpStatus.OK)
					             .body(Message.builder()
					            		       .message("조회결가가 없어요")
					            		       .build());
			
				
		}
		
		Message responseMsg = Message.builder()
				 .message("조회결과가 있어요")
				 .data(notice)
				 .build();
		
		return ResponseEntity.status(HttpStatus.OK).body(responseMsg);
		
		
	}
	
	
	@PostMapping
	public ResponseEntity save(Notice notice) {
		log.info("이게 노티스", notice);
		
		if("".equals(notice.getNoticeTitle()) || "".equals(notice.getNoticeWriter()) || "".equals(notice.getNoticeNo())) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Message.builder()
															     . message("서비스 요청 실패")
															     .data("필수파라미터 누락")
															     .build());
		}
		int result = noticeService.save(notice);
		
		if(result == 0) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Message.builder()
																.message("꺼져")	
																.build());
			
		}
		
		Message responseMsg = Message.builder().data("추가")
											   .message("서비스 요청 성공")
											   .build();
		
		return ResponseEntity.status(HttpStatus.OK).body(responseMsg);
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Message> deleteById(@PathVariable int id){
		
		int result = noticeService.delete(id);
		
		if(result == 0) {
			return ResponseEntity.status(HttpStatus.OK).body(Message.builder()
														.message("게시글이 존재하지 않음")
														.build());
		}
		
		
		Message responseMsg = Message.builder().data("삭제성공!").message("서비스처리 성공").build();
		
		return ResponseEntity.status(HttpStatus.OK).body(responseMsg);
		
		
		
		
		
		
	}
	
	
	@PutMapping
	public ResponseEntity<Message> update(@RequestBody Notice notice){
		
		int result = noticeService.update(notice);
		
		if(result == 0) {
			return ResponseEntity.status(HttpStatus.OK).body(Message.builder()
														.message("공지사항이 변경에 실패")
														.build());
		}
		
		
		Message responseMsg = Message.builder()		
									 .data(result)
									 .message("공지사항 변경에 성공")
									 .build();
		
		
		return ResponseEntity.status(HttpStatus.OK).body(responseMsg);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
