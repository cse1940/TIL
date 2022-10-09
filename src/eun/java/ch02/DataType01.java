package eun.java.ch02;

public class DataType01 {

	public static void main(String[] args) {
		
		int age = 10; // 변수 선언과 동시에 초기화
		int age2 = age; // 변수 선언과 동시에 초기화
		
		int age3; // 변수 선언
		age3 = 0; // 선언 후 초기화
		
		int age4 = age3;
		
		long lage = 0;
		lage = age4; // auto casting -> 자동적 형변환(작<큰)
		age4 = (int)lage; // manual casting -> 형변환 필요함(큰<작)
		
		int in1 = 100;
		long lo1 = 1000;
		short sh1 = 10;
		byte by1 = 1;
		char ch1 = 65; // 문자를 표현하는 ascii 코드
		
		System.out.println(in1);
		System.out.println(lo1);
		System.out.println(sh1);
		System.out.println(by1);
		System.out.println(ch1);
		
//		byte < short < int < long


	}

}
