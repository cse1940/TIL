package basic;

public class Custom4 {
	
//	��ȯ��, �Լ���, �Ű�����
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}

	public static void main(String[] args) {

//		4. max()�� �̿��Ͽ� �ִ��� �����ϴ� ���α׷�
		System.out.println("(345, 567, 9999) �߿��� ���� ū ���� " + function(345, 567, 9999) + " �Դϴ�.");

	}

}
