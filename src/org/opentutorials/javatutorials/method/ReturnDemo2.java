package org.opentutorials.javatutorials.method;

public class ReturnDemo2 {

	public static void main(String[] args) {
		
		System.out.println(num(1));
	}
	
	public static String num(int i) {
		if(i == 0) {
			return "zero";
		} else if(i == 1) {
			return "one";
		} else if(i == 2) {
			return "two";
		} return "none";
	}
//	return이 여러 번 등장하지만 중복적으로 실행될 가능성이 없다
//	return "none";을 제거하면 컴파일이 되지 않는다

}
