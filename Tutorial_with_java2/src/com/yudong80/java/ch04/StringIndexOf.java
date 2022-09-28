package com.yudong80.java.ch04;

public class StringIndexOf {

	public static void main(String[] args) {
		
//		1. indexOf() 
//			-> 대상 문자열에 나타나는 첫 번째 위치 반환, 존재하지 않으면 -1
		String poem = 
				"Two roads diverged in a yellow wood,\n" +
				"And sorry I could not travel both";
		
		int firstAndPosition = poem.indexOf("And");
		int firstIPosition = poem.indexOf("I");
		System.out.println("And의 첫 위치는 " + firstAndPosition + "입니다.");
		System.out.println("I의 첫 위치는 " + firstIPosition + "입니다.");
		
		int secondLineIndex = firstAndPosition;
		System.out.println("두 번째 줄의 위치는 " + secondLineIndex + "입니다.");
		System.out.println("두 번째주 줄의 내용은 " + poem.substring(secondLineIndex) + "입니다.");
		
//		2. lastIndexOf()
//			-> 대상 문자열에 나타나는 마지막 위치 반환, 존재하지 않으면 -1
		
		poem += "\nAnd be one traveller, long I stood";
		
		int lastAndPostion = poem.lastIndexOf("And");
		System.out.println("And의 마지막 위치는 " + lastAndPostion + "입니다.");

	}

}
