package org.opentutorials.javatutorials.method;

public class ReturnDemo3 {

	public static void main(String[] args) {
		
//		메소드는 여러 개의 입력 값을 가질 수 있다
//		그렇다면 여러 개의 값을 출력하고 싶다면?
//		하나의 변수에 여러개의 값을 담아서 출력하면 된다
		System.out.println(getMember1());
		System.out.println(getMember2());
		System.out.println(getMember3());
		
	}
	
	public static String getMember1() {
		return "최진혁";
	}
	
	public static String getMember2() {
		return "최승은";
	}
	
	public static String getMember3() {
		return "한이람";
	}
	

}
