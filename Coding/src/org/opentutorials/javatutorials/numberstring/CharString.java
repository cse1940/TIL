package org.opentutorials.javatutorials.numberstring;

public class CharString {

	public static void main(String[] args) {
		// 문자(Char)와 문자열(String)으로 구분한다.
		// 문자는 한 글자를 의미하고,
		// ''(작은따옴표)로 감싸야 한다.
		// 문자열은 여러 개의 문자가 결합한 것을 의미하고,
		// ""(큰따옴표)로 감싸야 한다.
		System.out.println('생');
		System.out.println("생활코딩");
				
		// 하나의 문자를 큰따옴표로 감싼다고 에러가 발생하지는 않는다. 
		// 한 글자도 문자열이 될 수 있기 때문
	    System.out.println("생");
	    
	    // 문자의 연산 : +
	    System.out.println("생활코딩" + "입니다.");
	    System.out.println("1" + "1");
	    
	    // 만약 문자열 안에 큰따옴표를 넣고 싶다면?
	    // escape 1. \" \"
	    System.out.println("egoing said \"Welcome programming world!\"");
	    // 2. 줄바꿈 : \n
	    System.out.println("egoing said \n\"Welcome programming world!\"");
				

	}

}
