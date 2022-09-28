package org.opentutorials.javatutorials.eclipse;

public class Variables {

	public static void main(String[] args) {

//		변수는 문자나 숫자 같은 데이터를 담는 컨테이너이다.
//		여기에 담겨진 데이터는 다른 데이터로 바꿀 수 있다.
		int a; // 정수 변수 a를 사용하겠다고 변수를 선언한 것
		a = 1; // 좌항의 변수 a에 숫자 1을 대입(할당)한 것
		System.out.println(a + 1);
		
		a = 2;
		System.out.println(a + 1);
		
		double b = 1.1; // 변수가 실수를 담는 그릇
		System.out.println(b + 1.1);
		
		b = 2.1;
		System.out.println(b + 1.1);
		
//		변수는 변할 수 있는 수라는 뜻이다.
		String first = "coding"; // 문자열을 변수에 담을 때는 String
		System.out.println(first + " " + "everybody!");
		
		String c, d;
		c = "coding";
		d = " everybody!";
		System.out.println(c + d);

	}

}
