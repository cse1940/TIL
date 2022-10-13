package org.opentutorials.javatutorials.overloading.example1;

class Calculator {
	int left, right;
	int third = 0;
	
	public void setOprands(int left, int right) {
		System.out.println("setOprands(int left, int right)");
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right, int third) {
		System.out.println("setOprands(int left, int right, int third)");
		this.left = left;
		this.right = right;
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
	}
	
//	이를 통해서 알 수 있는 것은 매개변수의 숫자에 따라서 같은 이름의,
//	서로 다른 메소드를 호출하고 있다는 것을 알 수 있음
//	이름은 같지만 시그니처는 다른 메소드를 중복으로 선언할 수 있는 방법을 메소드 오버로딩(overloading)이라고 함

}
