package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {

	public static void main(String[] args) {
		
//		프로그래밍의 기본은 중복을 제거하는 것이다
//		로직을 메소드로 만들면 코드의 양을 줄일 수 있고,
//		문제가 생겼을 때 원일을 더 쉽게 찾을 수 있다
		sum(10, 20);
		sum(20, 40);

	}
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

}
