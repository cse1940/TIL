package basic;

public class Recursive4 {
	
	public static int fibonacci(int number) {
		if(number == 1) { // ù ��° ����
			return 1;
		} else if(number == 2) { // �� ��° ����
			return 1;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

	public static void main(String[] args) {

//		4. �Ǻ���ġ ������ ��� �Լ��� ������ �� �ִ�.
		System.out.println("�Ǻ���ġ ������ 10��° ���Ҵ� " + fibonacci(10) + " �Դϴ�.");
	}

}
