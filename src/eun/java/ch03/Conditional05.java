package eun.java.ch03;

import java.util.Scanner;

public class Conditional05 {

	public static void main(String[] args) {
		
//		사용자로부터 0 ~ 100 사이의 값을 입력 받는다(점수)
//		Scanner 객체
//		int jumsu에 저장한다
//		90 이상이면 A
//		80 ~ 90 B
//		70 ~ 80 C
//		60 ~ 70 D
//		60 미만 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해 주세요: ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 90) {
			System.out.println("당신의 학점은 A입니다.");
		} else if(jumsu >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if(jumsu >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if(jumsu >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다.");
		}

	}

}
