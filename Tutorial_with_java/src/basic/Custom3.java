package basic;

public class Custom3 {
	
//	��ȯ��, �Լ���, �Ű�����
	public static char function(String input) {
		return input.charAt(input.length() -1);
	}

	public static void main(String[] args) {

//		3. ���ڿ����� ������ �ܾ ��ȯ�ϴ� �Լ�
		System.out.println("Hello World�� ������ �ܾ�� " + function("Hello World") + " �Դϴ�.");
	}

}
