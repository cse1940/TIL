package eun.java.ch03;

import java.util.Scanner;

public class Conditional06 {

	public static void main(String[] args) {
		
//		간단한 조건문 이라면 삼항연산자로 대체 가능
//		정수를 입력 받아서 짝수, 홀수를 출력하는 프로그램을 작성해보자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요: ");
		
		int number = sc.nextInt();
		
		String result = (number % 2 == 0)? "짝수" : "홀수";
		System.out.println(result);

	}

}
