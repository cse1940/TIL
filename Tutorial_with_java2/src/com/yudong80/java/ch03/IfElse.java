package com.yudong80.java.ch03;

public class IfElse {

	public static void main(String[] args) {

//		2. if와 else
		int grade = 88;
		
		if(90 < grade && grade <= 100) {
			System.out.println("당신의 성적은 A 입니다.");
		} else if(80 < grade && grade <= 90) {
			System.out.println("당신의 성적은 B 입니다.");
		} else if(70 < grade && grade <= 80) {
			System.out.println("당신의 성적은 C 입니다.");
		} else if(60 < grade && grade <= 70) {
			System.out.println("당신의 성적은 D 입니다.");
		} else {
			System.out.println("당신의 성적은 F 입니다.");

		}
		
	}

}
