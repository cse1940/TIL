package eun.java.ch03;

public class Conditional09 {
	
//	enum 키워드는 열거 타입을 선언하기 위한 키워드임
//	열거 타입(Status) 이름을 지정하고 열거 상수(low, middle, hight)를 나열하면 됨
	enum Status { 
		low, middle, hight
	}

	public static void main(String[] args) {
		
//		문자, 문자열, 정수, enum 열거형 상수
		Status a = Status.low;
		
		switch (a) {
		case low:
			System.out.println("low");
			break;
		case middle:
			System.out.println("middle");
			break;
		case hight:
			System.out.println("hight");
			break;
		default:
			System.out.println("other");
			break;
		}

	}

}
