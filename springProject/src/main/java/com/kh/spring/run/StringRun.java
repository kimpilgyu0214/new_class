package com.kh.spring.run;

import java.util.HashSet;
import java.util.Set;

import com.kh.spring.controller.StringController;
import com.kh.spring.hash.model.vo.Student;

public class StringRun {
	
	public static void main(String[] args) {
	StringController sc = new StringController();
	sc.constructorString();
	sc.assignToString();
	sc.stringPool();

	

	Set<Student> students = new HashSet();
	
	students.add(new Student("홍길동", 15,100));
	students.add(new Student("홍길동", 15,100));
	
	
	
	}
}
