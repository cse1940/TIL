package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	
//	��ȿ����?
//	�޼ҵ峪 Ŭ���� �ȿ� ���ԵǾ �̷��� ��ɵ��� ��ǰ���μ��� ��ġ�� �����ִ� ������ �Ѵ�
	static void a() { 
		int i = 0; // ���� i�� �޼ҵ� a�� �Ҽӵ� ������� �ǹ̴�
				   // ����, �� ������ ���� ��� �ٲ㵵 �� ������ �ۿ��� ������ ���� �ʴ´�
	}

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			a(); // ���� ������ ���� �� �ܺο� ������ ��ġ�� �ʴ´ٴ� ���� �� �� �ִ�
			System.out.println(i);
		}
	}

}
