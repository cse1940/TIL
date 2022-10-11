package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	
	static int i; // 전역변수 : 위치적으로 어떠한 메소드의 소속도 아니다(클래스 변수)
	
	static void a() { // 지역변수
		i = 0; // 클래스 멤버인 변수 i를 의미하게 된다
	}

	public static void main(String[] args) {
		
		for(i=0; i<5; i++) { // 클래스 멤버인 변수 i를 의미하게 된다
			a();
			System.out.println(i);
		}

	}

}
