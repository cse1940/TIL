package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// �ݺ����� ���� 2. continue
		// �׷� ������ ��� �ߴ��ϸ鼭, �ݺ��� �����ذ��� �Ϸ���?
		 for (int i = 0; i < 10; i++) {
	            if (i == 5)
	                continue;
	            System.out.println("Coding Everybody " + i);
	        }

	}

}
