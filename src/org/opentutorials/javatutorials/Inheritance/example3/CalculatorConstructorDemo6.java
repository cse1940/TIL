package org.opentutorials.javatutorials.Inheritance.example3;

class Calculator {
	int left, right;
	
	public Calculator() {}
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
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

//	그런데 상위 클래스인 Calculator에는 left와 right 값을 초기화할 수 있는 좋은 생성자가 이미 존재한다
//	이것을 사용한다면 하위 클래스에서 left와 right의 값을 직접 설정하는 불필요한 절차를 생략할 수 있을 것이다
//	어떻게 하면 상위 클래스의 생성자를 호출할 수 있을까?
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        super(left, right); // super : 상위 클래스를 가리키는 키워드
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo6 {

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
	}

}
