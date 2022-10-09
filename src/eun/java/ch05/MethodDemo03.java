package eun.java.ch05;

import java.util.Scanner;

public class MethodDemo03 {

	public static void main(String[] args) {
		
//		1. ����ڷκ��� ���� ������ 2�� �Է¹޾� ���ϴ� ���α׷�
		
//		�ڵ��� �������� ����
		int num1 = inputNumber(), num2 = inputNumber();
		if(num1 == -1 || num2 == -1) {
			return; // ���α׷� ����
		}
		
//		�� ���� ������ �޾Ƽ� ó���ϴ� �Լ�
		fourClac(num1, num2);
	}
	
//	����ڷκ��� ���� �Է¹޴� �Լ� 
	public static int inputNumber() {
		System.out.print("���ڸ� �Է��� �ּ���(0 ~ 100): ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0 || num > 100) {
			System.out.println("�߸� �Է��߳׿�. Ȯ���� �ּ���.");
			return -1;
		}
		return num;
	}
	
	public static void fourClac(int num1, int num2) {
		calc4operation(num1, num2, "+");
		calc4operation(num1, num2, "-");
		calc4operation(num1, num2, "*");
		calc4operation(num1, num2, "/");
	}
	
//	�ڵ��� ��Ȱ�� -> �ݺ� ���
	public static void calc4operation(int i1, int i2, String op) { // calc4operation(3, 4, *)
		int num3 = 0;
		switch(op) {
		case "+":
			num3 = i1 + i2;
			System.out.println("�� ������ ���� " + num3 + "�Դϴ�.");
			break;
		case "-":
			num3 = i1 - i2;
			System.out.println("�� ������ ���� " + num3 + "�Դϴ�.");
			break;
		case "*":
			num3 = i1 * i2;
			System.out.println("�� ������ ���� " + num3 + "�Դϴ�.");
			break;
		case "/":
			double temp = (double)i1 / i2;
			System.out.printf("�� ������ �������� %.2f �Դϴ�.", temp);
			break;
		default:
			System.out.println("��Ģ���길 �����մϴ�. �ٽ� �Է��� �ּ���.");
		}
	
	}

}
