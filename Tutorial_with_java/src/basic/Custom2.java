package basic;

public class Custom2 {
	
//	��ȯ��, �Լ���, �Ű�����
	public static int function(int number, int k) {
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				k--;
				if(k == 0) {
					return i;
				}
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {

//		2. ��� �� K��°�� ���� ���� ã�� ���α׷�
		int result = function(3050, 10);
		
		if(result == -1) {
			System.out.println("3050�� 10��° ����� �����ϴ�.");
		} else {
			System.out.println("3050�� 10��° ����� " + result + " �Դϴ�.");
		}
	}

}
