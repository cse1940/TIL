package eun.java.ch03;

import java.util.Scanner;

public class Conditional11 {

	public static void main(String[] args) {
		
//		if switch 구문으로 자유롭게 사용자로부터 학년과 점수를 입력받아서
//		4학년은 70점 이상이면 합격
//		5학년은 80점 이상이면 합격
//		6학년은 90점 이상이면 합격
//		그리고 위의 조건을 벗어난 입력이면 잘못 입력했습니다.를 출력한다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년을 입력해 주세요: ");
		int grade = sc.nextInt();
		System.out.print("점수를 입력해 주세요: ");
		int jumsu = sc.nextInt();
		
		switch (grade) {
		case 4:
			if(jumsu >= 70) {
				System.out.println("축하합니다. 합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
			break;
		case 5:
			if(jumsu >= 80) {
				System.out.println("축하합니다. 합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
			break;
		case 6:
			if(jumsu >= 90) {
				System.out.println("축하합니다. 합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}

	}

}
