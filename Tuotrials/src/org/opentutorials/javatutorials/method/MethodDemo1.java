package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	
    // �޼ҵ��� ���ǿ� ȣ��
	// ���� : ���� �޼ҵ带 ����� ��
	// ȣ�� : ������� �޼ҵ带 �����ϴ� ��
	public static void numbering() {
		int i=0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) { // numbering �޼ҵ� ȣ���
		numbering();
		numbering();
	}

}
