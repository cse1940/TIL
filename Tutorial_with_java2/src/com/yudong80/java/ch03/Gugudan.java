package com.yudong80.java.ch03;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

//		다음은 사용자의 입력을 받아 원하는 구구단을 출력하는 예제입니다.
//		1. 단을 입력합니다.
		Scanner s = new Scanner(System.in);
		System.out.println("구구단 몇 단을 원하시나요?");
		int dan = s.nextInt();
		
//		2. 구구단은 2단에서 9단까지만 가능합니다.
		if(! (dan >= 2 && dan <= 9)) {
			System.out.println("구구단은 2단 ~ 9단까지만 선택할 수 있습니다. 프로그램을 종료합니다.");
			s.close();
			return;
		}
		
//		3. 구구단을 출력합니다.
		for(int i=1; i<10; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}

//		4. 스캐너를 닫습니다.
		s.close();

	}

}
