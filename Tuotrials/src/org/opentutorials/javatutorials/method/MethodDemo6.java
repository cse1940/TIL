package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	// return 
	public static String numbering(int init, int limit) {
		int i=init;
		// ��������� ���ڵ��� output�̶�� ������ ��� ����
		// ������ �� ���� �־���.
		String output="";
		while(i < limit) {
			// ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� �����.
			output +=i;
			i++;
		}
	
	// output�� ����ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ���
	// �Ʒ��� ���� return�� ��ġ�ϸ� ��.
	return output;
	}

	public static void main(String[] args) {
		// �޼ҵ� numbering�� return�� ���� ���� result�� ����.
	    String result=numbering(1, 5);
	    // ���� result�� ���� ȭ�鿡 �����.
	    System.out.println(result);

	}

}
