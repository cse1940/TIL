package days_220917;

public class DataType03 {

	public static void main(String[] args) {
// 		���ڿ� String
//		"�ȳ��ϼ���", "hello"
		int num = 0, num2 = 0;
		String str = "hello"; 
		String str1 = "hello"; // ���ͷ�
		String str2 = new String("hello");
		String str3 = new String("hello"); // ��ü����
		System.out.println("str = " + str);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("---------------");
		System.out.println(str1.equals(str));
		
//		��ü(Object)�� �޸� �ּҰ��� ������ �ִ�. �׷��� ���������� �ϰ� �ȴ�.
//		������ ���� ���� ������ �ִ�.
		str2 = str3;
		str2 = "good";
		System.out.println(str2 == str3);
		
//		���ڿ��� �����ϴ� ���
//		1. ���ͷ���� String str = "hello"
//			- ������ ���ڿ��� ������ �ѹ��� �����ȴ�.
//			- �׸��� ������ �ּҸ� ����(��ü)�� �����Ѵ�.
//			- �׷��� ����(��ü)���� == ���ص� �ȴ�.
//		2. ��ü������� String str = new String("hello")
//			- �������� ���ڿ��� �����Ѵ�.
//			- �׸��� ������ �ּҸ� ����(��ü)�� �����Ѵ�.
//			- �׷��� ����(��ü)�� ���� �ٸ���. == ���ϸ� �ȵȴ�.
//			- ����, ���� ���� ��ü�� ����Ű�� ���� ���� ��
//			- ����(��ü).equals(����(��ü))
	}

}
