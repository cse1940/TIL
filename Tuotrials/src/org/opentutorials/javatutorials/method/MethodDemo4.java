package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	// �޼ҵ� : �Է°�
	public static void numbering(int limit) {
		// int limit=5; �� ȿ������ ������.
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
