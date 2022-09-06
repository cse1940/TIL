package org.opentutorials.javatutorials.scope;

class C {
	int v=10;
	
	void m() {
		int v=20;
		System.out.println(v);
		System.out.println(this.v); // 인스턴스 그 자체, 전역번수임.
	}
}

public class ScopeDemo7 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m();

	}

}
