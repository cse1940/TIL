package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// Run Configurations..
		String id = args[0]; // 입력값이 들어온다.라는 뜻, args[0] == "egoing"
		if(id.equals("egoing")) {
			System.out.println("right"); // .equals는 앞의 문자와 뒤의 문자 비교하는 것
		} else {
			System.out.println("wrong");
		}

	}

}
