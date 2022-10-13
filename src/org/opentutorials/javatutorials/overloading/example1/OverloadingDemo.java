package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo {
	
	void A() {
		System.out.println("void A()");
	}
	
	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}
	
	void A(String arg1) {
		System.out.println("void A(String arg1)");
	}

	public static void main(String[] args) {
		
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(1);
		od.A("힘들어도 포기하지 말자!");

	}
	
//	결론적으로 말하면 메소드 오버로딩은 매개변수를 사용함
//	즉, 매개변수가 다르면 이름이 같아도 서로 다른 메소드가 되는 것임
//	반면에 매개변수는 같지만 리턴타입이 다르면 오류가 발생함

}
