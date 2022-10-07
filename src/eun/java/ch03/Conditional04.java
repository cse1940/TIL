package eun.java.ch03;

import java.util.Scanner;

public class Conditional04 {

	public static void main(String[] args) {

//		사용자의 입력을 받는 객체를 하나 생성해 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해 주세요: ");
		int number = sc.nextInt();
		
		if(number >= 5 && number < 10) {
			System.out.println("입력하신 숫자는 5이상 10미만 입니다.");
		}
		
		if(number >= 10 || number < 5) {
			System.out.println("입력하신 숫자는 10이상 또는 5미만 입니다.");
		}

	}

}
