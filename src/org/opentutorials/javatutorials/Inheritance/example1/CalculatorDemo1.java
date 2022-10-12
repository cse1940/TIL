package org.opentutorials.javatutorials.Inheritance.example1;

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

//	Calculator : 상위 클래스, SubstractionableCalculator : 하위 클래스(상속 받음)
//	따라서, Calculator에서 정의한 메소드 setOprands, sum, avg를 사용할 수 있게 된다
//	-> 재활용성과 중복의 제거, 유지보수의 편의
class SubstractionableCalculator extends Calculator {
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
