package days_220917;

public class DataType01 {

	public static void main(String[] args) {
//		int (정수)
//		정수를 저장할 수 있는 공간이 필요하면 -> 만들면 됨
//		변수를 만드는 방법? -> 자료형 변수명;
		
		int age = 10; // 변수 선언과 동시에 초기화
		int age2 = age; // 변수 선언과 동시에 초기화
		
		int age3; // 변수 선언
		age3 = 0; // 선언 후 초기화
		int age4 = age3;
		
		long lage = 0;
		lage = age4; // auto casting
		age4 = (int)lage; // manual casting -> 코딩 필요함
		
		int in1 = 0;
		long lo1 = 0;
		short sh1 = 0;
		byte by1 = 0;
		char ch1 = 65; // 문자를 표현하는 ascii 코드
		
		System.out.println(in1);
		System.out.println(lo1);
		System.out.println(sh1);
		System.out.println(by1);
		System.out.println(ch1);

//		byte < short < int < long (숫자표현)

	}

}
