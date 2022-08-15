package com.yudong80.java.ch02;

public class 논리연산자 {

	public static void main(String[] args) {
		int a = 4;
		boolean inTheMiddle = 3 < a && a < 5; //and
		boolean isNaturalNumber = a > 0 || a == 0; //or
		boolean isPositive = !(a < 0); //not
		
		System.out.println("a는 3보다 크고 4보다 작다? " + inTheMiddle);
		System.out.println("a는 자연수이다? " + isNaturalNumber);
		System.out.println("a는 양수이다? " + isPositive);
		

	}

}
