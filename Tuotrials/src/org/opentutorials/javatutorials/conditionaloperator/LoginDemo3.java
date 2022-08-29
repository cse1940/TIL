package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo3 {

	public static void main(String[] args) {
		// 논리 연산자를 이용하여 이전 예제 개선함.
		// 중첩된 if문을 하나로 줄인 덕분에 코드의 복잡성 낮아짐.
		String id = args[0];
        String password = args[1];
        if (id.equals("egoing") && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

	}

}
