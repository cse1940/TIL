package com.yudong80.java.ch03;

public class ForSimple {

	public static void main(String[] args) {

//		가상의 for문: 반복 횟수만 넣으면 됨
		String[] cities = {"Seoul", "London", "Stockholm"};
		
		int idx = 0;

//		for (3) { // 이런 for문은 없습니다.
		System.out.println(cities[idx++]);

	}

}
