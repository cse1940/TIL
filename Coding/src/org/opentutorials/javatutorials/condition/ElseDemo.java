package org.opentutorials.javatutorials.condition;

public class ElseDemo {

	public static void main(String[] args) {
		// if, else문은 딱 한 번만...
		// else if문은 중첩 가능함
		if(false) {
			System.out.println(1);
		} else if(true) {
			System.out.println(2); // 2
		} else if(true) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}

}
