package org.opentutorials.javatutorials.overloading.example1;

//	Ŭ���� OverloadingDemo2�� OverloadingDemo�� ��� �ް� ����
public class OverloadingDemo2 extends OverloadingDemo {

//	�̷��� ������ ������ �θ� Ŭ���������� ���ǵǾ� ���� �ʱ� ������ �޼ҵ� �����ε��� �Ǵ� ��	
	void A(String arg1, String arg2) {
		System.out.println("sub class: void A (String arg1, String arg2)");
	}
	
//	�θ� Ŭ�������� �̹� �Ű������� ���� �޼ҵ� A�� ������ -> �������̵�
	void A() {
		System.out.println("sub class: void A()");
	}

	public static void main(String[] args) {
		
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A(1);
		od.A("coding is fun");
		od.A("coding is fun", "�ֽ����̶�� �ؿ�");

	}
	
//	overriding VS overloading
//	- overriding 
//	  : �θ� Ŭ������ �޼ҵ��� ���۹���� ����
//	- overloading
//	  : ���� �̸�, �ٸ� �Ű������� �޼ҵ���� ������ ���� �� �ִٴ� ��
}
