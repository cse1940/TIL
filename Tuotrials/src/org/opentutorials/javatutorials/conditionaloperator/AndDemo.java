package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		// && : 좌항과 우항의 값이 모두 true일 때 사용한다.
		if (true && true) {
            System.out.println(1);
        }
 
        if (true && false) {
            System.out.println(2);
        }
 
        if (false && true) {
            System.out.println(3);
        }
 
        if (false && false) {
            System.out.println(4);
        }

	}

}
