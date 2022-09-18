package days_220917;

public class DataType02 {

	public static void main(String[] args) {
// 		boolean형 데이터 타입
//		변수명을 만들 때 명명규칙
//		1. 숫자로 시작하지 않는다.
//		2. 예약어라는 시스템이 점유하고 있는 단어를 사용하지 않는다.
//		3. 변수명은 자유롭게 만드나, 의미를 최대한 살린다.
		
		boolean isSuccess = false;
		System.out.println(isSuccess);
		System.out.println(!isSuccess);
		isSuccess = !isSuccess;
		
		boolean trueOrFalse = false;
		System.out.println(2 > 1);
		
		trueOrFalse = 2 > 1;
		System.out.println("trueOrFalse = 2 > 1 " + trueOrFalse);
		trueOrFalse = 2 < 1;
		System.out.println("trueOrFalse = 2 < 1 " + trueOrFalse);
		trueOrFalse = 2 == 1;
		System.out.println("trueOrFalse = 2 == 1 " + trueOrFalse);
		trueOrFalse = 2 != 1;
		System.out.println("trueOrFalse = 2 != 1 " + trueOrFalse);
		trueOrFalse = !(2 > 1);
		System.out.println("trueOrFalse = !(2 > 1) " + trueOrFalse);
		
		System.out.println(""+100+200);
		
//		참 or 거짓 판단 -> 비교연산자를 통해서 한다.
//		문자열 비교는(같다, 같지 않다) 함수를 이용
		System.out.println("100" == "100");
		System.out.println("100".equals("100"));
		System.out.println("hello" == "hello");
		System.out.println("hello".equals("hello"));

	}

}
