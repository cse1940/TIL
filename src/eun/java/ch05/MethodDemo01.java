package eun.java.ch05;

import java.util.Scanner;

public class MethodDemo01 {

	public static void main(String[] args) {
		
//		메소드의 장점
//		1. 코드의 재활용 -> 반복 사용
//		2. 가독성 증가 -> 로직들의 집합
		
//		1. 사용자로부터 양의 정수 2개를 입력받아서 곱하는 프로그램
		int num1 = inputNumber(), num2 = inputNumber();
		if(num1 == -1 || num2 == -1) 
			return;
		fourCalc(num1, num2);
		
	}
//		2. 코드의 가독성을 높인다
		public static int inputNumber() {
			System.out.print("0 ~ 100 값을 입력해 주세요: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num < 0 || num > 100) {
				System.out.println("잘못 입력했어요. 입력한 값을 확인해 주세요.");
				
			}
			return num;
		}
		
		public static void fourCalc(int num1, int num2) {
			calcOperation(num1, num2, "+");
			calcOperation(num1, num2, "-");
			calcOperation(num1, num2, "*");
			calcOperation(num1, num2, "/");
			}
		
//		1. 코드의 재활용 -> 반복 사용
		public static void calcOperation(int i1, int i2, String op) {
			int num3 = 0;
			switch(op) {
			case "+":
				num3 = i1 + i2;
				System.out.println("두 변수의 합은 " + num3 + "입니다.");
				break;
			case "-":
				num3 = i1 - i2;
				System.out.println("두 변수의 차 " + num3 + "입니다.");
				break;
			case "/":
				double temp = (double) i1 / i2;
				System.out.printf("두 변수의 나눗셈은 %.2f", temp);
				break;
			default:
				System.out.println("사칙연산만 가능합니다. ");
				break;
		}

	}

}
