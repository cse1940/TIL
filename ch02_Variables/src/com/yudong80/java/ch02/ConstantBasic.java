package com.yudong80.java.ch02;

public class ConstantBasic {
	//1. �Ϲ��� ��� ���� (�⺻ ���)
			static final double PI = 3.14; //������
			static final int MAX_COUNT = 100; //�ִ� ����
			static final String COLUMN_STUDENT_NAME = "student_name"; //�л� �̸� �÷�

	public static void main(String[] args) {
		//2. �Լ� �� ��� ���� (�ʿ��� ���)
		final int MAX_INTEGER = Integer.MAX_VALUE;
		
		//3. �Լ� �� ��� ���� (����õ)
		final char DEFAULT_GRADE;
		
		//����� ����� ���ǰ� �и��Ǿ� ������ �������� ������
		DEFAULT_GRADE = 'C';
		
		System.out.println("��� PI: " + PI);
		System.out.println("�ִ� ����: " + MAX_COUNT);
		System.out.println("�л� �̸� �÷�: " + COLUMN_STUDENT_NAME);
		System.out.println("�ִ� int ��: " + MAX_INTEGER);
		System.out.println("�⺻ ����: " + DEFAULT_GRADE);

		
		
	 

	}

}
