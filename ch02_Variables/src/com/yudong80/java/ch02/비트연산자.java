package com.yudong80.java.ch02;

public class ��Ʈ������ {

	public static void main(String[] args) {
		//��Ʈ AND(&)
		int a = 0x0A; //1010
		int mask1 = 0x01; //0001
		int mask2 = 0x02; //0010
		
		System.out.println("16���� a�� ù ��° �ڸ�����? " + (a & mask1));
		System.out.println("16���� a�� �� ��° �ڸ�����? " + (a & mask2));
		
		//��Ʈ OR(&)
		System.out.println("7(111) OR 16(10000) = " + (7 | 16));
		System.out.println("8(1000) OR 15(1111) = " + (8 | 15));

	}

}
