package org.opentutorials.javatutorials.conditionaloperator;

public class OrDemo {

	public static void main(String[] args) {
		// || : 좌우항 중에 하나라도 true라면 전체가 true
		if (true || true) {
            System.out.println(1);
        }
        if (true || false) {
            System.out.println(2);
        }
        if (false || true) {
            System.out.println(3);
        }
        if (false || false) {
            System.out.println(4);
        }

	}

}
