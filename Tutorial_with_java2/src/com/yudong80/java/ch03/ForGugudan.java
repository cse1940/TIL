package com.yudong80.java.ch03;

public class ForGugudan {

	public static void main(String[] args) {

//		1. 구구단 (3단)
		int dan = 3;
		System.out.println("3단을 외워보자!");
		for(int i=1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}

	}

}
