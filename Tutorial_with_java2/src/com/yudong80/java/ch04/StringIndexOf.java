package com.yudong80.java.ch04;

public class StringIndexOf {

	public static void main(String[] args) {
		
//		1. indexOf() 
//			-> ��� ���ڿ��� ��Ÿ���� ù ��° ��ġ ��ȯ, �������� ������ -1
		String poem = 
				"Two roads diverged in a yellow wood,\n" +
				"And sorry I could not travel both";
		
		int firstAndPosition = poem.indexOf("And");
		int firstIPosition = poem.indexOf("I");
		System.out.println("And�� ù ��ġ�� " + firstAndPosition + "�Դϴ�.");
		System.out.println("I�� ù ��ġ�� " + firstIPosition + "�Դϴ�.");
		
		int secondLineIndex = firstAndPosition;
		System.out.println("�� ��° ���� ��ġ�� " + secondLineIndex + "�Դϴ�.");
		System.out.println("�� ��°�� ���� ������ " + poem.substring(secondLineIndex) + "�Դϴ�.");
		
//		2. lastIndexOf()
//			-> ��� ���ڿ��� ��Ÿ���� ������ ��ġ ��ȯ, �������� ������ -1
		
		poem += "\nAnd be one traveller, long I stood";
		
		int lastAndPostion = poem.lastIndexOf("And");
		System.out.println("And�� ������ ��ġ�� " + lastAndPostion + "�Դϴ�.");

	}

}
