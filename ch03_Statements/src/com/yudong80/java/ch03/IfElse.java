package com.yudong80.java.ch03;

public class IfElse {

	public static void main(String[] args) {
		//2. if와 else
		int grade = 88;
		
		if (90 < grade && grade <= 100) {
			System.out.println("당신의 성적은 a");
		} else if (80 < grade && grade <= 90) {
			System.out.println("당신의 성적은 b");
		} else if (70 < grade && grade <= 80) {
			System.out.println("당신의 성적은 c");
		} else if (60 < grade && grade <= 70) {
			System.out.println("당신의 성적은 d");
		} else {
			System.out.println("당신의 성적은 f");
		}
	}

}
