package eun.java.ch03;

import java.util.Scanner;

public class Conditional07 {

	public static void main(String[] args) {
		
//		사용자로부터 몸무게, 신장을 입력받는다
//		BMI = 몸무게(kg) / (신장(m)*신장(m))
//		BMI 값이 아래와 같다면 해당 내용을 출력한다
//		18.5 이하 저체중
//		18.5 ~ 23 정상
//		23 ~ 25 과체중
//		25 ~ 30 비만
//		30 이상 고도비만
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력해 주세요: ");
		double weight = sc.nextDouble();
		System.out.print("신장을 입력해 주세요: ");
		double height = sc.nextDouble();
		
		double BMI = weight / (0.01*height*0.01*height);
		
		String result = "";
		if(BMI < 18.5) {
			result = "저체중";
		} else if(BMI <= 23) {
			result = "정상";
		} else if(BMI <= 25) {
			result = "과체중";
		} else if(BMI <= 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		
		System.out.printf("BMI 지수가 %f 이므로 %s 입니다.\n", BMI, result);
		
//		사용자로부터 연도를 입력받아 윤년인지 판단한다
//		1. 연도가 4의 배수이면서 100으로 나누어 떨어지지 않으면 윤년
//		2. 단, 연도가 400으로 나누어 떨어지는 해는 윤년
		
		System.out.println("연도를 입력해 주세요: ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.printf("%d년은 윤년입니다!", year);
		} else {
			System.out.printf("%d년은 윤년이 아닙니다.", year);
		}

	}

}
