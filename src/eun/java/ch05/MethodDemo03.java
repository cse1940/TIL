package eun.java.ch05;

import java.util.Scanner;

public class MethodDemo03 {

	public static void main(String[] args) {
		
//		1. 사용자로부터 양의 정수를 2개 입력받아 곱하는 프로그램
		
//		코드의 가독성을 높임
		int num1 = inputNumber(), num2 = inputNumber();
		if(num1 == -1 || num2 == -1) {
			return; // 프로그램 종료
		}
		
//		두 개의 변수를 받아서 처리하는 함수
		fourClac(num1, num2);
	}
	
//	사용자로부터 값을 입력받는 함수 
	public static int inputNumber() {
		System.out.print("숫자를 입력해 주세요(0 ~ 100): ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0 || num > 100) {
			System.out.println("잘못 입력했네요. 확인해 주세요.");
			return -1;
		}
		return num;
	}
	
	public static void fourClac(int num1, int num2) {
		calc4operation(num1, num2, "+");
		calc4operation(num1, num2, "-");
		calc4operation(num1, num2, "*");
		calc4operation(num1, num2, "/");
	}
	
//	코드의 재활용 -> 반복 사용
	public static void calc4operation(int i1, int i2, String op) { // calc4operation(3, 4, *)
		int num3 = 0;
		switch(op) {
		case "+":
			num3 = i1 + i2;
			System.out.println("두 변수의 합은 " + num3 + "입니다.");
			break;
		case "-":
			num3 = i1 - i2;
			System.out.println("두 변수의 차는 " + num3 + "입니다.");
			break;
		case "*":
			num3 = i1 * i2;
			System.out.println("두 변수의 곱은 " + num3 + "입니다.");
			break;
		case "/":
			double temp = (double)i1 / i2;
			System.out.printf("두 변수의 나눗셈은 %.2f 입니다.", temp);
			break;
		default:
			System.out.println("사칙연산만 가능합니다. 다시 입력해 주세요.");
		}
	
	}

}
