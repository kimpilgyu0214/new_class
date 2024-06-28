package com.kh.spring.notice.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notice {

	
	
	
	private int noticeNO;
	private String noticeTitle;
	private String noticeContent;
	private String noticeWriter;
	private String createDate;
}
