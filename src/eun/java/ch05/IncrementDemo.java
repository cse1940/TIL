package eun.java.ch05;

public class IncrementDemo {

	public static void main(String[] args) {
		
		int x = 0;
		System.out.println("ȣ�� �� x�� ���� " + x + "�Դϴ�.");
		increment(x);
		System.out.println("ȣ�� �� x�� ���� " + x + "�Դϴ�.");
		

	}
	
	public static void increment(int n) {
		System.out.println("�Լ� ���ο��� ���޹��� n�� ���� " + n + "�Դϴ�.");
		n++;
		System.out.println("�Լ� ���ο��� ������ n�� ���� " + n + "�Դϴ�.");
	}

}
