package com.yudong80.java.ch02;

public class ArrayException {

	public static void main(String[] args) {

//		1. �迭 ����
		int[] grades = {80, 95, 92, 70};
		int[][] gradesMulti = {{80, 95, 92,70}, {70,99,75,100}};
		
//		2. �������� ���
		System.out.println("grades�� ù ��° ����: " + grades[0]);
		System.out.println("gradesMulti[1][1] ����: " + gradesMulti[1][1]);
		System.out.println("grades�� ����: " + grades.length);
		
//		3. ���� �߻�
		int error = grades[grades.length];
		

	}

}
