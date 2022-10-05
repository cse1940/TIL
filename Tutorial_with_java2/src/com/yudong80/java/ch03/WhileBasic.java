package com.yudong80.java.ch03;

public class WhileBasic {

	public static void main(String[] args) {

//		1. 구구단 (3단)
		int dan = 3;
		int i = 1;
		System.out.println("3단을 외워보자!");
		
		while(i < 10) {
			System.out.println(dan + "*" + i + "=" + dan*i);
			i++;
		}

	}

}
