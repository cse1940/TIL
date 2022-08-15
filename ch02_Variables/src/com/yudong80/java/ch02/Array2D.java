package com.yudong80.java.ch02;

public class Array2D {

	public static void main(String[] args) {
		//1. 2���� �迭 ����
		int[][] grades = {
				{80, 75, 92, 70}, //Jane
				{60, 52, 88, 40}, //Mike
		};
		
		//2. 2���� �迭 ��� ���� (��, grades[0][i])
		double sumJane = 0;
		for (int i = 0; i < grades[0].length; ++i) {
			int grade = grades[0][i];
			sumJane += grade;
		}
		double averageJane = sumJane / grades[0].length;
		
		//3. for each�� Ȱ���� 2���� �迭 ���
		double sumMike = 0;
		for (int grade : grades[1]) {
			sumMike += grade;
		}
		double averageMike = sumMike / grades[1].length;
		System.out.println("��ü �л����� " + grades.length);
		System.out.println("Jane�� ��� ������ " + averageJane);
		System.out.println("Mike�� ��� ������ " + averageMike);
	}

}
