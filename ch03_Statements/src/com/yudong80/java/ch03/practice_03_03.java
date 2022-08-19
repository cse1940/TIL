//다음은 성인(19세 이상)과 청소년(13세~ 19세 미만)을 구별하는 예제 코드입니다.
package com.yudong80.java.ch03;

public class practice_03_03 {

	public static void main(String[] args) {
		int age = 17;
		
		if (age >= 19) {
			System.out.println("성인입니다.");
		} else if (13 <= age && age < 19) {
			System.out.println("청소년입니다.");
		} else {
			System.out.println("어린이입니다.");
		}
		

	}

}
