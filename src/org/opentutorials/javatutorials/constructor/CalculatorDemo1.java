package org.opentutorials.javatutorials.constructor;

class Calculator {
	int left, right;
	
//	생성자 : 그 이름처럼 객체를 생성할 때 호출된다
//	특징 1. 값을 반환하지 않는다
//		   반환 값이 없기 때문에 return도 사용하지 않고, 반환 값을 메소드 정의에 포함시키지도 않는다
//	특징 2. 생성자의 이름은 클래스의 이름과 동일하다
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
//		위의 생성자를 이용해서 객체를 생성하는 방법
		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();

	}

}
