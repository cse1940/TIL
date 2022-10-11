package org.opentutorials.javatutorials.scope;

class C3 {
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(this.v);
	}
}

public class ScopeDemo9 {

	public static void main(String[] args) {
		
		C3 c1 = new C3();
		c1.m();

	}
	
//	유호범위란 변수를 전역변수, 지역변수 나눠서 좀 더 관리하기 편리하도록 한 것 이다
//	객체지향 프로그래밍에서도 가급적이면 전역변수의 사용을 자제하는 것이 좋고,
//	동시에 단일 객체가 너무 비대해지지 않도록 적절하게 규모를 쪼개는 것도 중요하다
}
