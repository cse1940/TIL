package basic;

public class Operator2 {

	public static void main(String[] args) {

// 		1. '조건 ? 참 : 거짓'연산을 이용한 프로그램(삼항연산자)
		int x = 50;
		int y = 60;
		
		System.out.println("최댓값은 " + max(x, y) + "입니다.");
		
//		2. pow()를 이용한 거듭제곱 연산 프로그램
		
		double a = Math.pow(3.0, 20.0);
		System.out.println("3의 20제곱은 " + (int)a + "입니다.");
		

	}

//		반환형, 함수 이름, 매개 변수
		static int max(int a, int b) {
			int result = (a>b) ? a:b;
			return result;

	}

}
