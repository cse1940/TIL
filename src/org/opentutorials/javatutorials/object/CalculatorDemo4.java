package org.opentutorials.javatutorials.object;

class Calculator {
	int left, right; // int 변수 선언
	
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

public class CalculatorDemo4 {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
	}
	
//	즉, 하나의 클래스를 바탕으로 서로 다른 상태를 가진
//	인스턴스를 만들면 서로 다른 행동을 하게 된다는 것을 알 수 있다 -> 재활용성

}
