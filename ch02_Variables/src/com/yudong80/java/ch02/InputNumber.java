package com.yudong80.java.ch02;

import java.util.Scanner;

public class InputNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù ���� ���ڸ� �Է��ϼ���? ");
		int first = s.nextInt(); //Scanner Ŭ������ nextInt() �޼ҵ带 ȣ���ؾ� ��
		
		System.out.println("�� ��° ���ڸ� �Է��ϼ���? ");
		int second = s.nextInt();
		int added = first + second;
		System.out.println("�� ������ ���� " + added + "�Դϴ�.");

	}

}
