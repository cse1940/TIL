package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// Run Configurations..
		String id = args[0]; // �Է°��� ���´�.��� ��, args[0] == "egoing"
		if(id.equals("egoing")) {
			System.out.println("right"); // .equals�� ���� ���ڿ� ���� ���� ���ϴ� ��
		} else {
			System.out.println("wrong");
		}

	}

}
