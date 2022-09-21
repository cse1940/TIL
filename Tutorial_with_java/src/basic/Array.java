package basic;

import java.util.Scanner;

public class Array {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {

//		1. ���ϴ� ������ŭ�� �迭 ���� �� �ִ� ���ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �迭�� ũ�⸦ �Է��ϼ���: ");
		int number = scanner.nextInt();
		
		int[] array = new int[number];
		for(int i=0; i<number; i++) {
			System.out.print("�迭�� �Է��� ������ �ϳ��� �Է��ϼ���(���): ");
			array[i] = scanner.nextInt();
		}
		int result = -1;
		for(int i=0; i<number; i++) {
			result = max(result, array[i]);
		}
		System.out.println("�Է��� ���� �� ���� ū ���� " + result + "�Դϴ�.");
		
//		2. 100���� ���� ������ ����� ���ϴ� ���α׷�
		int[] array2 = new int[100];
		for(int i=0; i<100; i++) {
			array2[i] = (int)(Math.random() * 100 + 1);
		}
		int sum = 0;
		for(int i=0; i<100; i++) {
			sum += array2[i];
		}
		System.out.println("100���� ���� ������ ��հ��� " + sum/100 + "�Դϴ�.");

	}

}
