package basic;

public class Custom {
	
//	��ȯ��, �Լ���, �Ű�����
	public static int function(int a, int b, int c) {
		int min = 0;
		if(a > b) {
			if(b > c) {
				
			} else {
				min = b;
			}
		} else {
			if(a > c) {
				min = c;
			} else {
				min = a;
			}
		}
		for(int i=min; i>0; i--) {
			if(a % i == 0 && b % i == 0 && c % i == 0) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {

//		1. 3���� �� �ִ� ������� ã�� ���α׷�
		System.out.println("(400, 300, 750)�� �ִ� ����� : " + function(400, 300, 750));

	}

}
