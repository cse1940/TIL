package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	// 메소드 : 입력값
	public static void numbering(int limit) {
		// int limit=5; 은 효율성이 떨어짐.
		int i=0;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numbering(5);

	}

}
