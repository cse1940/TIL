package eun.java.ch05;

import java.util.Scanner;

public class MethodDemo01 {

	public static void main(String[] args) {
		
//		�޼ҵ��� ����
//		1. �ڵ��� ��Ȱ�� -> �ݺ� ���
//		2. ������ ���� -> �������� ����
		
//		1. ����ڷκ��� ���� ���� 2���� �Է¹޾Ƽ� ���ϴ� ���α׷�
		int num1 = inputNumber(), num2 = inputNumber();
		if(num1 == -1 || num2 == -1) 
			return;
		fourCalc(num1, num2);
		
	}
//		2. �ڵ��� �������� ���δ�
		public static int inputNumber() {
			System.out.print("0 ~ 100 ���� �Է��� �ּ���: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num < 0 || num > 100) {
				System.out.println("�߸� �Է��߾��. �Է��� ���� Ȯ���� �ּ���.");
				
			}
			return num;
		}
		
		public static void fourCalc(int num1, int num2) {
			calcOperation(num1, num2, "+");
			calcOperation(num1, num2, "-");
			calcOperation(num1, num2, "*");
			calcOperation(num1, num2, "/");
			}
		
//		1. �ڵ��� ��Ȱ�� -> �ݺ� ���
		public static void calcOperation(int i1, int i2, String op) {
			int num3 = 0;
			switch(op) {
			case "+":
				num3 = i1 + i2;
				System.out.println("�� ������ ���� " + num3 + "�Դϴ�.");
				break;
			case "-":
				num3 = i1 - i2;
				System.out.println("�� ������ �� " + num3 + "�Դϴ�.");
				break;
			case "/":
				double temp = (double) i1 / i2;
				System.out.printf("�� ������ �������� %.2f", temp);
				break;
			default:
				System.out.println("��Ģ���길 �����մϴ�. ");
				break;
		}

	}

}
