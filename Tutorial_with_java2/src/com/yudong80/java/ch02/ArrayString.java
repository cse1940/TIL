package com.yudong80.java.ch02;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {

		String[] cities = new String[10]; // 배열 개수는 10개로 지정
		
		int idx = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 도시를 입력하세요!");
		cities[idx++] = s.nextLine();
		
		System.out.println("두 번째 도시를 입력하세요!");
		cities[idx++] = s.nextLine();
		
		System.out.println("세 번째 도시를 입력하세요!");
		cities[idx++] = s.nextLine();
		s.close();
		
		System.out.println("===================");
		System.out.println("입력한 도시의 갯수는 " + idx + "입니다.");
		System.out.println("첫 번째 도시는 " + cities[0] + "입니다.");
		System.out.println("마지막 도시는 " + cities[idx-1] + "입니다.");
		
		

	}

}
