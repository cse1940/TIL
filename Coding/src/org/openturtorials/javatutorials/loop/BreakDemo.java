package org.openturtorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		// �ݺ����� ���� : break
		// �ݺ��۾��� �߰��� �ߴܽ�Ű�� ���� ��
		for(int i=0; i < 10; i++) {
			if(i == 5) // 5~ ���� �ݺ��۾� �ߴ�
				break;
			System.out.println("Coding Everybody! " +i);
 
	    }
	}
}
