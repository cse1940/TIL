package basic;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

//		1. 자신의 이름을 출력하는 프로그램
		Scanner name = new Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까? ");
		String i = name.next();
		System.out.println(i);
		
//		2. 사칙연산 실행 결과? 
		System.out.println(10 + 10); // 20
		System.out.println(30 + 30); // 60
		System.out.println(20 - 5); // 15
		System.out.println(40 / 3); // 19
		System.out.println(395 % 10); // 5
		
		
//		3. 사각형 모양을 출력하는 프로그램
		for(int n=0; n<10; n++) {
			for(int m=0; m<10; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
