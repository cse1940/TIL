package eun.java.ch05;

public class MethodDemo01 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		System.out.println("1 ~ 10 ���� " + sum + "�Դϴ�.");

		sum = 0;
		for(int i=10; i<=100; i++) {
			sum += i;
		}
		System.out.println("10 ~ 100 ���� " + sum + "�Դϴ�.");
		
		sum = 0;
		for(int i=100; i<=1000; i++) {
			sum += i;
		}
		System.out.println("100 ~ 1000 ���� " + sum + "�Դϴ�.");
	}

}
