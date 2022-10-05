package basic;

public class Conditional {

	public static void main(String[] args) {

//		1. if문을 이용하여 문자열이 특정 문자열을 포함하는지 확인하는 프로그램
		String a = "I Love You!";
		if(a.contains("Love")) {
//			포함하는 경우 실행되는 부분
			System.out.println("Me Too!");
		} else {
//			포함하지 않는 경우 실행되는 부분
			System.out.println("I Hate You!");
		}
		
//		2. 점수에 따라서 다른 메세지를 출력하는 프로그램
		int score = 95;
		if(score >= 90) {
			System.out.println("A+입니다.");
		} else if(score >= 80) {
			System.out.println("B+입니다.");
		} else if(score >= 7) {
			System.out.println("C+입니다.");
		} else {
			System.out.println("F입니다.");
		}
		
//		3. 문자열과 정수형을 각각 조건문을 이용해 보기
		String name = "Man";
		int b = 0;
//		자바는 String을 비교할 때 .equals을 이용합니다.
//		String은 다른 자료형과 다른 문자열 자료형이기 때문입니다.
		if(name.equals("Man")) {
			System.out.println("당신은 남자입니다.");
		} else {
			System.out.println("당신은 여자입니다.");
		}
		
		if(b == 3) {
			System.out.println("b는 3입니다.");
		} else {
			System.out.println("b는 3이 아닙니다.");
		}
		
		if(name.equalsIgnoreCase("man") && b == 0) {
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}

	}

}
