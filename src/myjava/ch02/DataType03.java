package myjava.ch02;

public class DataType03 {

	public static void main(String[] args) {
		
		int num = 0, num2 = 0;
		String str = "hello"; // ����
		String str1 = "hello"; // ����
		
		String str2 = new String("hello"); // ��ü
		String str3 = new String("hello"); // ��ü
		
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("==============");
		System.out.println(str1.equals(str));
		
//		object�� �޸� �ּҰ��� ������ �ִ�. �׷��� ���������� �ϰ� �ȴ�.
//		������ ���� ���� ������ �ִ�.
		
		System.out.println(str1 == str2); // str1�� str3�� ���� ���� �Ǿ����Ƿ� �ּҰ� �ٸ���.
		System.out.println(str1.equals(str2)); // .equals()�� ������ ���ϱ� ������ hello ������ �����Ƿ� true ��ȯ
		
//		���ڿ��� �����ϴ� ���
//		1. ���ͷ� ��� String str = "hello";
//			- ������ ���ڿ��� ������ �� ���� �����ȴ�.
//			-- �׸��� ������ �ּҸ� ����(��ü)�� �����Ѵ�.
//			-- �׷��� ����(��ü)���� == ���ص� �ȴ�.
//		
//		2. ��ü������� String str = new String("hello");
//			- �������� ���ڿ��� �����Ѵ�.
//			- �׸��� ������ �ּҸ� ����(��ü)�� �����Ѵ�.
//			- �׷��� ����(��ü)�� ���� �ٸ���. == ���ϸ� �� �ȴ�.
//			- ���� ���� �� ��ü�� ����Ű�� ���� ���� ��
//			-- ����(��ü).equals(����(��ü))

	}

}
