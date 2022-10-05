package com.yudong80.java.ch04;

import java.util.Scanner;

public class FibonacciV2 {
	
	static int getUserInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���!");
		int num = s.nextInt();
		s.close(); // ����ϸ� �ִ��� ���� �ݾ� �ݴϴ�.
		return num;
	}

	public static void main(String[] args) {
		
		System.out.println("�Ǻ���ġ ���� �����");
		
		int num = getUserInput();
		
		int a = 1;
		int b = 1;
		
		int[] fibonacci = new int[num];
		fibonacci[0] = a;
		fibonacci[1] = b;
		for(int i=0; i<num-2; ++i) {
			fibonacci[i+2] = a + b;
			a = b;
			b = fibonacci[i+2];
		}
		
		System.out.println("���: ");
		for(int i=0; i<num; ++i) {
			System.out.println(fibonacci[i]);
		}
	}

}
