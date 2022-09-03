package org.opentutorials.javatutorials.classinstance;

class Calculator2 {
	static double PI=3.14;
	// 클래스 변수인 base가 추가되었음
	static int base=0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	public void sum() {
		// 더하기에 base의 값을 포함시킴
		System.out.println(this.left + this.right + base);
	}

	public void avg() {
      // 평균치에 base의 값을 포함시킴
	  System.out.println((this.left + this.right + base)/2);
  }
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20);
		c1.sum(); // 30
		
		Calculator2 c2 = new Calculator2();
		c2.setOprands(20, 40);
		c2.sum(); // 60
		
		// 클래스 변수 base의 값을 10으로 지정했음
		Calculator2.base=10;
		
		c1.sum(); // 40
		c2.sum(); // 70

	}

}
