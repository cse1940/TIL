package eun.java.ch05;

public class MethodDemo02 {

	public static void main(String[] args) {
		
		System.out.println("1 ~ 10 ���� " + sum(1, 10) + "�Դϴ�.");
		System.out.println("10 ~ 100 ���� " + sum(10, 100) + "�Դϴ�.");
		System.out.println("100 ~ 1000 ���� " + sum(100, 1000) + "�Դϴ�.");
	}
	
//	�޼��带 �̿��ϸ� ���� �� �ִ� ����
//	1. �ߺ� �ڵ带 ���̰� �ڵ带 ������ �� �ִ�
//	2. �ڵ带 ���ȭ�� �������� ���̹Ƿ� ���α׷��� ǰ���� ����Ų��
	public static int sum(int i1, int i2) { // method
//	public : ���� ������
//	static : ��ü�� �������� �ʰ� ������ �� �ִ�(static�� static���� ���)
//	int : ��ȯ Ÿ��
//	sum : �޼��� �̸�
//	int i1, int i2 : �Ű����� ���
		int sum = 0; // ���� ����
		for(int i=i1; i<=i2; i++) {
			sum += i;
		}
		return sum;
	}

}
