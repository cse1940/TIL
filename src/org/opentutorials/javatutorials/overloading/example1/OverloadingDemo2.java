package org.opentutorials.javatutorials.overloading.example1;

//	클래스 OverloadingDemo2는 OverloadingDemo을 상속 받고 있음
public class OverloadingDemo2 extends OverloadingDemo {

//	이러한 형태의 변수는 부모 클래스에서는 정의되어 있지 않기 때문에 메소드 오버로딩이 되는 것	
	void A(String arg1, String arg2) {
		System.out.println("sub class: void A (String arg1, String arg2)");
	}
	
//	부모 클래스에는 이미 매개변수가 없는 메소드 A가 존재함 -> 오버라이딩
	void A() {
		System.out.println("sub class: void A()");
	}

	public static void main(String[] args) {
		
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A(1);
		od.A("coding is fun");
		od.A("coding is fun", "최승은이라고 해요");

	}
	
//	overriding VS overloading
//	- overriding 
//	  : 부모 클래스의 메소드의 동작방법을 변경
//	- overloading
//	  : 같은 이름, 다른 매개변수의 메소드들을 여러개 만들 수 있다는 것
}
