package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {

	public static void main(String[] args) {
		
//		����� ��� �ִ� �迭�� ��ȯ�ϰ� �ִ�
//		�޼ҵ� getMembers�� ������ �迭�� members ������ ��Ҵ�
//		�� ������ �̿��ؼ� ���� ���� �����͸� ó���� �� �ְ� �ȴ�
		String[] members = getMembers();
		
	}
	
	public static String[] getMembers() {
		String[] members = {"������", "�ֽ���", "���̶�", "������"};
		return members;
	}

}
