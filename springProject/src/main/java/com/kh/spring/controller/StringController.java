package com.kh.spring.controller;

public class StringController {

	// String 클래스 => 불변(변하지 않음을 의미)
	
	//생성자를 호출해서 String 객체를 생성
	public void constructorString() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		String[] strArr = {};
		
		// toString()
		System.out.println(str1.toString());
		System.out.println(str2);
		
		//1. String클래스의 toString의 경우
		// 실제 담겨있는 문자열 리터럴을 반환하게끔 오버라이딩
		
		//equals()
		System.out.println(str1.equals(str2));
		//true
		// 주소값 비교가 아닌 실제 문자열 리터럴값을 비교하도록 오버라이딩
		
		//hashCode()
		//16진수는 알아보기 힘드니까 => int형 10진수
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(str1==str2);
	}
	
	//리터럴 대입방식
	public void assignToString() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		// toString()
		System.out.println(str1);
		System.out.println(str2);
		
		//equals()
		System.out.println(str1.equals(str2));
		
		//System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	public void stringPool() {
		
		String str = "Hello";
		//대입연산자를 이용해서 문자열 리터럴값을 대입시 StringPool 영역에 올라감
		
		String newStr = "Hello";
		//StringPool 특징 : 동일한 내용의 문자열 리터럴이 존재할 수 없음.
		
		str = "Bye";
		//연결이 끊긴 문자열은 가비지콜렉터가 정리해줌
		//객체는 불변
		//참조변수는 새로운 주소값을 참조
	}
	
}
