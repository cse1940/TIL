package org.opentutorials.javatutorials.method;

public class MethodDemo1 {

	public static void main(String[] args) {
		
//		�޼ҵ� numbering�� ������ �����
		numbering(); 

	}

//	�޼ҵ��� ����(���� �޼ҵ带 ����� ��)�� ȣ��(������� �޼ҵ带 �����ϴ� ��)
//	�޼ҵ带 ���� �� public static�̶�� ����� �Ѵٰ� �ϴ��� ��������� ��������
	public static void numbering() {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}

}
