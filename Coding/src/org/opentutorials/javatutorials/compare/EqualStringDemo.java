package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		// .equals�� ���ڿ��� ���� �� ����ϴ� �޼ҵ��̴�.
		String a = "Hello World!";
		String b = new String("Hello World!");
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true

	}

}
