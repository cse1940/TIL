package com.yudong80.java.ch05;

public class PersonExampleV1 {
	
//	��� ����
	String firstName = "�ڹ�";
	String lastName = "��";
	int age = 24;
	int height = 165;
	
//	��� �Լ�(�޼���)
	void gotoOffice(String destination) {
		System.out.println(getKoreanName() + "���� " + destination + "���� ����մϴ�.");
	}
	
	String getKoreanName() {
		return lastName + " " + firstName;
	}

	public static void main(String[] args) {
		
		PersonExampleV1 p = new PersonExampleV1();
		p.gotoOffice("����");
	}

}
