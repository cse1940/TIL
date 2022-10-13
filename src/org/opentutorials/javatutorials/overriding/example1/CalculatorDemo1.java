package org.opentutorials.javatutorials.overriding.example1;

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
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

class SubstractionableCalculator extends Calculator {
	
//	메소드 sum이 하위 클래스 SubstractionableCalculator에 추가 되었다
//	실행결과는 c1.sum이 상위 클래스의 메소드가 아니라 하위 클래스의 메소드 sum을 실행하고 있다
//	하위 클래스 입장에서 부모 클래스란 말하자면 기본적인 동작 방법을 정의한 것이라고 생각할 수 있다
//	-> 메소드 오버라이딩(overriding)
	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) +"입니다.");
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();

	}

}
