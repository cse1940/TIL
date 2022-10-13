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

//	�׷��� ���� Ŭ������ Calculator���� left�� right ���� �ʱ�ȭ�� �� �ִ� ���� �����ڰ� �̹� �����Ѵ�
//	�̰��� ����Ѵٸ� ���� Ŭ�������� left�� right�� ���� ���� �����ϴ� ���ʿ��� ������ ������ �� ���� ���̴�
//	��� �ϸ� ���� Ŭ������ �����ڸ� ȣ���� �� ������?
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        super(left, right); // super : ���� Ŭ������ ����Ű�� Ű����
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
