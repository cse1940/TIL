package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		// 조건문의 대표적인 문법은 if문이다.
		// 사용빈도는 적지만 조건이 많다면 switch문이 로직을 보다 명료하게 보여줄 수 있다.
		
		System.out.println("switch(1)");
		switch(4) {
		case 1:
			System.out.println("one"); // one
		case 2:
			System.out.println("two"); // two
		case 3:
			System.out.println("three"); // three
		// 가장 마지막은 default로 끝난다.
		// 즉, 주어진 케이스가 없는 경우 default문이 실행됨
		default: 
			System.out.println("default");
		}
		
		System.out.println("switch(2)");
		switch(2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two"); // two
		case 3:
			System.out.println("three"); // three
		}
		
		System.out.println("switch(2-1)");
		switch(2) {
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
			break; // two, 프로그램 종료
		case 3:
			System.out.println("three"); 
		}
		
		int val = 1;
		System.out.println("<switch문은 if문으로 대체 가능>");
		if(val == 1) {
			System.out.println("one");
		} else if(val == 2) {
			System.out.println("two");
		} else if(val == 3) {
			System.out.println("three");
		}

	}

}
