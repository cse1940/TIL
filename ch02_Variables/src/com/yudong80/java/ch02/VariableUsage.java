package com.yudong80.java.ch02;

public class VariableUsage {

	public static void main(String[] args) {
		//1. 변수 선언과 정의를 한 번에
		int studentNum = 500;
		String name = "Choi Seung Eun";
		double gradeJava = 4.0;
		double gradeC = 3.8;
		double avg = 0;
		
		//2. 연산 (재정의)
		avg = (gradeJava + gradeC) / 2;
		name = "Yu, DongHwan";
		studentNum = 600;

	}

}
