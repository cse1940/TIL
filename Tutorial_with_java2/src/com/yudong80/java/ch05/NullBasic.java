package com.yudong80.java.ch05;

public class NullBasic {

	public static void main(String[] args) {
		
//		1. null�� �ǹ�
		String star; // ��ü�� �ʱⰪ�� null�� ����
		Car car1 = null; // ��������� null�� ���� ����
		Car[] cars; // �迭 ���� null��
		
//		2. null ���´� �ּ�ȭ�ؾ� ��
		star = "My name is star";
		car1 = new Car("Purple");
		cars = new Car[1];
		cars[0] = new Car("MAGENTA");
		
//		3. null�� �ƴϱ⿡ ��� ��� ������
		System.out.println(star);
		System.out.println(car1);
		System.out.println(cars);
		System.out.println(cars[0]);

	}

}
