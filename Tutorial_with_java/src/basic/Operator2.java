package basic;

public class Operator2 {

	public static void main(String[] args) {

// 		1. '���� ? �� : ����'������ �̿��� ���α׷�(���׿�����)
		int x = 50;
		int y = 60;
		
		System.out.println("�ִ��� " + max(x, y) + "�Դϴ�.");
		
//		2. pow()�� �̿��� �ŵ����� ���� ���α׷�
		
		double a = Math.pow(3.0, 20.0);
		System.out.println("3�� 20������ " + (int)a + "�Դϴ�.");
		

	}

//		��ȯ��, �Լ� �̸�, �Ű� ����
		static int max(int a, int b) {
			int result = (a>b) ? a:b;
			return result;

	}

}
