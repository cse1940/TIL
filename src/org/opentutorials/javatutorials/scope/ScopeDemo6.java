package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
	
	static int i = 5; // 전역변수
	
	static void a() {
		int i = 10; // 지역변수
		b();
	}
	
	static void b() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		a();

	}

}
