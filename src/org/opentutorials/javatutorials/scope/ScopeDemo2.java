package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	
	static int i; // �������� : ��ġ������ ��� �޼ҵ��� �Ҽӵ� �ƴϴ�(Ŭ���� ����)
	
	static void a() { // ��������
		i = 0; // Ŭ���� ����� ���� i�� �ǹ��ϰ� �ȴ�
	}

	public static void main(String[] args) {
		
		for(i=0; i<5; i++) { // Ŭ���� ����� ���� i�� �ǹ��ϰ� �ȴ�
			a();
			System.out.println(i);
		}

	}

}
