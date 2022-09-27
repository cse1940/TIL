package com.yudong80.java.ch04;

import java.util.Scanner;

public class FibonacciV3 {
	
	static int getUserInput() {
		Scanner s = new Scanner (System.in);
		System.out.println("���� ������ �Է��ϼ���!");
		int num = s.nextInt();
		s.close(); // ����ϸ� �ִ��� ���� �ݾ� �ݴϴ�.
		return num;
	}
	
	static void getFibonacci(int fibonacci[]) {
		int a = 1;
		int b = 1;
		
		int num = fibonacci.length;
		fibonacci[0] = a;
		fibonacci[1] = b;
		for(int i=0; i<num-2; ++i) {
			fibonacci[i+2] = a + b;
			a = b;
			b = fibonacci[i+2];
		}
	}

	public static void main(String[] args) {
		System.out.println("�Ǻ���ġ ���� �����");
		
		int num = getUserInput();
		
		int[] fibonacci = new int[num]; // �迭�� ���� �����մϴ�.
		getFibonacci(fibonacci);
		
		System.out.println("���: ");
		for(int i=0; i<num; ++i) {
			System.out.println(fibonacci[i]);
		}

	}

}
