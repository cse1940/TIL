package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] members = {"������", "������", "���̶�"};
		// �ݺ����� �̿��ؼ� �迭 members�� ������ �ϳ��� ���� �Ŀ� 
		// ��� ����� ȭ�鿡 ����ϰ� �ִ�.
		// �迭�̶�, ������ ������ �ϳ��� �׷����� �����ϱ� ���ؼ� ����ϴµ�
		// �� ������ ó���� ���� �ݺ����� �ַ� �̿��Ѵ�.
		for(int i=0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "�� ����� �޾ҽ��ϴ�.");
			
		}

	}

}
