package com.yudong80.java.ch02;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {

		String[] cities = new String[10]; // �迭 ������ 10���� ����
		
		int idx = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���ø� �Է��ϼ���!");
		cities[idx++] = s.nextLine();
		
		System.out.println("�� ��° ���ø� �Է��ϼ���!");
		cities[idx++] = s.nextLine();
		
		System.out.println("�� ��° ���ø� �Է��ϼ���!");
		cities[idx++] = s.nextLine();
		s.close();
		
		System.out.println("===================");
		System.out.println("�Է��� ������ ������ " + idx + "�Դϴ�.");
		System.out.println("ù ��° ���ô� " + cities[0] + "�Դϴ�.");
		System.out.println("������ ���ô� " + cities[idx-1] + "�Դϴ�.");
		
		

	}

}
