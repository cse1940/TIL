package com.yudong80.java.ch03;

public class ElectrictityBillV1 {

	public static void main(String[] args) {

//		���� ��� ����
		System.out.println("=======================");
		System.out.println(" ���ÿ� ������(����) ���� ");
		System.out.println("=======================");
		
//		1. 100 ������ ���
		int value = 99;
		double price = 0;
		
		if(value <= 100) {
			price = value * 60.7;
		}
		System.out.println(value + "kWh�� ���� ����� " + price + "�� �Դϴ�.");
		
//		2. 100 �ʰ� 200 ������ ���
		value = 200;
		price = 0;
		
		if(100 < value && value <= 200) {
			price = value * 125.9;
		}
		System.out.println(value + "kWh�� ���� ����� " + price + "�� �Դϴ�.");

	}

}
