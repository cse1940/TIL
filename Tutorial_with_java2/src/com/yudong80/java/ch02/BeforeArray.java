package com.yudong80.java.ch02;

public class BeforeArray {

	public static void main(String[] args) {

		int korean = 80;
		int math = 85;
		int english = 100;
		int science = 76;
		
		System.out.println("국어: " + korean);
		System.out.println("수학: " + math);
		System.out.println("영어: " + english);
		System.out.println("과학: " + science);
		
		double average = ((double)(korean + math + english + science)) / 4;

		System.out.println("최승은님의 평균 점수는 " + average + "입니다.");
	}

}
