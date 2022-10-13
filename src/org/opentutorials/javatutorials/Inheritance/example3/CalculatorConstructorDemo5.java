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
//	���� Ŭ������ Calculator�� �����ڰ� �������� �ʴ´ٴ� �ǹ��̴�
//	���� Ŭ������ ȣ��� �� �ڵ����� ���� Ŭ������ �⺻ �����ڸ� ȣ���ϰ� �ȴ�
//	�׷��� ���� Ŭ������ �Ű������� �ִ� �����ڰ� �ִٸ� �ڹٴ� �ڵ����� ���� Ŭ������ �⺻ �����ڸ� ��������� �ʴ´�
//	���� �������� �ʴ� �����ڸ� ȣ���ϰ� �Ǳ� ������ ������ �߻��ߴ�
//	�� ������ �ذ��ϱ� ���ؼ��� ���� ���� ���� Ŭ������ �⺻ �����ڸ� �߰��ϸ� �ȴ�
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