package com.yudong80.java.ch02;

public class �������� {

	public static void main(String[] args) {
		int a = 4;
		boolean inTheMiddle = 3 < a && a < 5; //and
		boolean isNaturalNumber = a > 0 || a == 0; //or
		boolean isPositive = !(a < 0); //not
		
		System.out.println("a�� 3���� ũ�� 4���� �۴�? " + inTheMiddle);
		System.out.println("a�� �ڿ����̴�? " + isNaturalNumber);
		System.out.println("a�� ����̴�? " + isPositive);
		

	}

}
