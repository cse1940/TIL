package eun.java.ch05;

public class MethodDemo02 {

	public static void main(String[] args) {
		
		System.out.println("1 ~ 10 합은 " + sum(1, 10) + "입니다.");
		System.out.println("10 ~ 100 합은 " + sum(10, 100) + "입니다.");
		System.out.println("100 ~ 1000 합은 " + sum(100, 1000) + "입니다.");
	}
	
//	메서드를 이용하면 얻을 수 있는 장점
//	1. 중복 코드를 줄이고 코드를 재사용할 수 있다
//	2. 코드를 모듈화해 가독성을 높이므로 프로그램의 품질을 향상시킨다
	public static int sum(int i1, int i2) { // method
//	public : 접근 지정자
//	static : 객체를 생성하지 않고 실행할 수 있다(static은 static끼리 논다)
//	int : 반환 타입
//	sum : 메서드 이름
//	int i1, int i2 : 매개변수 목록
		int sum = 0; // 지역 변수
		for(int i=i1; i<=i2; i++) {
			sum += i;
		}
		return sum;
	}

}
