package com.yudong80.java.ch04;

public class StaticBasic {
	static double PIE = 3.14;
	
	static boolean isPositive(int num) {
		return num > 0;
	}

	public static void main(String[] args) {
		//1. static�� �޼��� ���ο����� ����� �� ����
		//static int num = 0; //������ ���� �߻�!
		
		//2. static�� �Լ� �ܺο� �ִ� ������ ������
		System.out.println("PIE �� " + PIE + " �Դϴ�.");
		
		//3. static�� �Լ��� ���� �� ����
		int num = 500;
		boolean isPositive = isPositive(num);
		System.out.println(num + "�� ����ΰ���? " + isPositive);
		
	}

}
