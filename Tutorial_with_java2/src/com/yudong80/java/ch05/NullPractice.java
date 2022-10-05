package com.yudong80.java.ch05;

public class NullPractice {

//	null �����ϱ�
	static void printName(String name) {
//		1. null�� ���� ������ skip �մϴ�
		if(name == null) return;
		
		System.out.println("printName: " + name);
	}
	
	static void printAlternativeName(String name) {
//		2. null�� ���� �ٸ� �̸����� ��ü�մϴ�
		if(name == null) {
			name = "�⺻ �̸�";
		}
		
		System.out.println("printAlternativeName: " + name);
	}
	
	static void printNameAs(String name, String defaultName) {
//		3. null�� ���� defaultName �μ��� ��ü�մϴ�
		if(name == null) {
			name = defaultName;
		}
		
		System.out.println("printNameAs: " + name);
	}

	public static void main(String[] args) {
		
		printName("Jennie");
		printName(null);
		printAlternativeName("Jennie");
		printAlternativeName(null);
		
		final String defaultName = "default name";
		printNameAs("James", defaultName);
		printNameAs(null, defaultName);

	}

}
