package basic;

public class Recursive2 {
	
	public static int factorial(int number) {
		if(number == 1)
			return 1;
		else
			return number * factorial(number - 1);
			// 5! = 5 * 4 * 3! ...
	}

	public static void main(String[] args) {
		
//		2. ���丮���� ��� �Լ��� ������ �� �ִ�.
		System.out.println("10!�� " + factorial(10) + " �Դϴ�.");

	}

}
