package basic;

public class Recursive {
	
	public static int factorial(int number) {
		int sum = 1;
		for(int i=2; i<=number; i++) {
			sum *= i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
//		1. ���丮���� �ݺ� �Լ��� ������ �� �ִ�.
		System.out.println("10!�� " + factorial(10) + " �Դϴ�.");
	

	}

}
