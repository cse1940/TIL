package eun.java.ch03;

import java.util.Scanner;

public class Conditional08 {

	public static void main(String[] args) {
		
//		윤년을 판단하는 프로그램을 간단하게 작성해 보기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력해 주세요: ");
		
		int year = sc.nextInt();
		
		String result = (year % 4 == 0 && year % 100 != 0 || year % 100 == 0)? "윤년 입니다." : "윤년이 아닙니다.";
		System.out.println(result);

	}

}
