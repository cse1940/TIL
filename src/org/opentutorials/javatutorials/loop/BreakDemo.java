package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i == 5) 
				break; // �ݺ��۾��� �ߴܿ� ��� �ߴ�
			System.out.println("���� �ڵ��� �������� ����! " + i);
		}

	}

}
