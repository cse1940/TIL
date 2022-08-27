package org.opentutorials.javatutorials.compare;

public class EqualStringDemo {

	public static void main(String[] args) {
		// .equals는 문자열을 비교할 때 사용하는 메소드이다.
		String a = "Hello World!";
		String b = new String("Hello World!");
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true

	}

}
