package org.opentutorials.javatutorials.method;

public class ReturnDemo3 {
	// 메소드는 여러 개의 입력값을 가질 수 있고,
	// 여러 개의 값을 출력하고 싶다면?
	public static String getMember1() {
		return "최승은";
	}
	public static String getMember2() {
		return "최승혁";
	}
	public static String getMember3() {
		return "박진형";
	}

	public static void main(String[] args) {
		System.out.println(getMember1());
		System.out.println(getMember2());
		System.out.println(getMember3());
	}

}
