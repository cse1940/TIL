package myjava.ch02;

public class DataType04 {

	public static void main(String[] args) {
		
//		기본 타입을 객체로 표현하는 방법 또는 지원
//		primitive 자료형(long, int, float 등)
//		1. 산술 연산이 가능하다.
//		2. null로 초기화 할 수 없다.
//		
//		wrapper 클래스(객체)
//		1. unboxing을 하지 않으면 산술 연산이 불가능 하지만, null값을 처리할 수 있다.
//		2. null값 처리가 용이하기 때문에 sql과 연동할 경우 처리가 용이하다.
		
		Integer num = 100;
		Short sh = 15;
		Double d = 13.5874;
		Float f = 156.5f;
		Long l = 9999999999L;
		System.out.println(num);

	}

}
