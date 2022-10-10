package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
//		자바에서 기본적으로 제공하는 라이브러리 중에 Scanner을 이용하면 쉽게 사용자의 입력을 잡을 수 있다
		Scanner sc = new Scanner(System.in);

//		sc.nextInt()가 실행되면 자바는 사용자의 입력이 있을 때까지
//		변수 i에 값을 할당하지 않고 대기상태에 있게 된다
		int i = sc.nextInt();
		System.out.println(i * 1000);
		sc.close();

	}

}
