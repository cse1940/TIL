package org.openturtorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// �ݺ����� ���� : continue
		for(int i=0; i < 10; i++) {
			if(i == 5) // i�� ���� 5�� ��, ���� �������� �Ѿ
				continue;
			System.out.println("Coding Everybody! " +i);
		}

	}

}
