package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		// ���ǹ��� ��ǥ���� ������ if���̴�.
		// ���󵵴� ������ ������ ���ٸ� switch���� ������ ���� ����ϰ� ������ �� �ִ�.
		
		System.out.println("switch(1)");
		switch(4) {
		case 1:
			System.out.println("one"); // one
		case 2:
			System.out.println("two"); // two
		case 3:
			System.out.println("three"); // three
		// ���� �������� default�� ������.
		// ��, �־��� ���̽��� ���� ��� default���� �����
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
			break; // two, ���α׷� ����
		case 3:
			System.out.println("three"); 
		}
		
		int val = 1;
		System.out.println("<switch���� if������ ��ü ����>");
		if(val == 1) {
			System.out.println("one");
		} else if(val == 2) {
			System.out.println("two");
		} else if(val == 3) {
			System.out.println("three");
		}

	}

}
