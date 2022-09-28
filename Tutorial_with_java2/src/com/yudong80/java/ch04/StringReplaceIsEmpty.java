package com.yudong80.java.ch04;

public class StringReplaceIsEmpty {

	public static void main(String[] args) {
		
//		1. replace()
//			-> 문자열 내부의 특정 문자열을 다른 문자열로 교체
		String javaWiki = "Java is a general-purpose programming language. Java";
		String python = javaWiki.replace("Java", "Python");
		
		System.out.println("원래 문장: " + javaWiki);
		System.out.println("치환된 문장: " + python);
		
//		2. isEmpty()
//			-> 문자열이 비어 있는지 확인
		String msg = ""; // default
		System.out.println("빈 문자열인가요? " + msg.isEmpty());
		
		msg = "새로운 메세지가 도착했습니다!";
		System.out.println("빈 문자열인가요? " + msg.isEmpty());

	}

}
