package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo {
	
	void A() {
		System.out.println("void A()");
	}
	
	void A(int arg1) {
		System.out.println("void A(int arg1)");
	}
	
	void A(String arg1) {
		System.out.println("void A(String arg1)");
	}

	public static void main(String[] args) {
		
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(1);
		od.A("���� �������� ����!");

	}
	
//	��������� ���ϸ� �޼ҵ� �����ε��� �Ű������� �����
//	��, �Ű������� �ٸ��� �̸��� ���Ƶ� ���� �ٸ� �޼ҵ尡 �Ǵ� ����
//	�ݸ鿡 �Ű������� ������ ����Ÿ���� �ٸ��� ������ �߻���

}
