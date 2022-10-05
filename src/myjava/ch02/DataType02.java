package myjava.ch02;

public class DataType02 {

	public static void main(String[] args) {
		
//			boolean형 변수 선언 및 초기화
//			성공여부를 판단하는 변수(true or false)
//			자바에서는 변수명을 만들 때 명명규칙을 카멜케이스를 따름
//			여러단어가 합쳐져 하나의 단어로 표현할 때,
//			첫 단어는 소문자로 그 다음부터는 첫글자만 대문자로
//			변수명은 자유롭게 만들되 몇 가지만 지켜주고 된다.
//			변수명은 의미를 최대한 살린다.
//			1. 숫자로 시작하지 않는다.
//			2. 예약어라는 시스템이 점유하고 있는 단어를 사용하지 않는다.
		
			boolean isSuccess = false;
			System.out.println(isSuccess);
			System.out.println(!isSuccess);
			
			System.out.println(2 > 1);
			
			boolean trueOrFalse = 2 > 1;
			System.out.println("trueOrFalse가 2 > 1 이므로 " + trueOrFalse + "입니다.");
			trueOrFalse = 2 < 1;
			System.out.println("trueOrFalse가 2 < 1 이므로 " + trueOrFalse + "입니다.");
			trueOrFalse = (2 == 1);
			System.out.println("trueOrFalse가 2 == 1 이므로 " + trueOrFalse + "입니다.");
			trueOrFalse = (2 != 1);
			System.out.println("trueOrFalse가 2 != 1 이므로 " + trueOrFalse + "입니다.");
			trueOrFalse = !(2 < 1);
			System.out.println("trueOrFalse가 !(2 < 1) 이므로 " + trueOrFalse + "입니다.");
			
			System.out.println(100 + "" + 200); // 숫자를 문자열로 합치는 방법
			
//			참과 거짓을 판단할 때는 비교연산자 == 를 통해 
//			문자열 비교는(같다, 같지 않다) .equals() 함수를 이용하는 것을 추천
//			더블쿼테이션으로 묶인 상수는 문자형 상수가 된다 그리고 직접비교 가능	
			
			System.out.println("100" == "100");
			System.out.println("100".equals("100"));
			
			System.out.println("hello" == "hello");
			System.out.println("hello".equals("hello"));

	}

}
