//������ ������� �Է��� �޾� ���ϴ� �������� ����ϴ� �����Դϴ�.
package com.yudong80.java.ch03;

import java.util.Scanner;

public class practice_03_01 {

	public static void main(String[] args) {
		//1. ���� �Է��մϴ�.
		Scanner s = new Scanner(System.in);
		System.out.println("������ �� ��? ");
		int dan = s.nextInt();
		
		//2. �������� 2�ܿ��� 9�ܱ����� �����մϴ�.
		if (dan < 2 && dan > 9) {
			System.out.println("�������� 2��~ 9�ܱ����� ������ �� �ֽ��ϴ�. ���α׷��� �����մϴ�.");
			s.close();
			return;
		}
		//3. �������� ����մϴ�.
		int i = 0;
		for (i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		//4. ��ĳ�ʸ� �ݽ��ϴ�.
		s.close();

	}

}
