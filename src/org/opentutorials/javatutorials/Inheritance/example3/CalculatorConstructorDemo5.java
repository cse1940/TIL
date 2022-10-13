package org.opentutorials.javatutorials.Inheritance.example3;
 
class Calculator {
    int left, right;
    
    public Calculator() {}
     
    public Calculator(int left, int right){
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
 
class SubstractionableCalculator extends Calculator {
//	상위 클래스인 Calculator의 생성자가 존재하지 않는다는 의미이다
//	하위 클래스가 호출될 때 자동으로 상위 클래스의 기본 생성자를 호출하게 된다
//	그런데 상위 클래스에 매개변수가 있는 생성자가 있다면 자바는 자동으로 상위 클래스의 기본 생성자를 만들어주지 않는다
//	따라서 존재하지 않는 생성자를 호출하게 되기 때문에 에러가 발생했다
//	이 문제를 해결하기 위해서는 위와 같이 상위 클래스에 기본 생성자를 추가하면 된다
	public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}