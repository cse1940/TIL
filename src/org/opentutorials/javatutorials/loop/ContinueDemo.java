package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i == 5)
				continue; // ������ ��� �ߴ��ϸ鼭 �ݺ��� �����ذ��� �Ѵ�
			System.out.println("���� �ڵ��� �������� ����!" + i);
		}

	}

}
