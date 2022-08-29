package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0]; // args[0]가 첫 번째 입력 값(egoing)을 의미한다.
        if(id.equals("egoing")){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }

	}

}
