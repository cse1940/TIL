package days_220917;

public class DataType01 {

	public static void main(String[] args) {
//		int (����)
//		������ ������ �� �ִ� ������ �ʿ��ϸ� -> ����� ��
//		������ ����� ���? -> �ڷ��� ������;
		
		int age = 10; // ���� ����� ���ÿ� �ʱ�ȭ
		int age2 = age; // ���� ����� ���ÿ� �ʱ�ȭ
		
		int age3; // ���� ����
		age3 = 0; // ���� �� �ʱ�ȭ
		int age4 = age3;
		
		long lage = 0;
		lage = age4; // auto casting
		age4 = (int)lage; // manual casting -> �ڵ� �ʿ���
		
		int in1 = 0;
		long lo1 = 0;
		short sh1 = 0;
		byte by1 = 0;
		char ch1 = 65; // ���ڸ� ǥ���ϴ� ascii �ڵ�
		
		System.out.println(in1);
		System.out.println(lo1);
		System.out.println(sh1);
		System.out.println(by1);
		System.out.println(ch1);

//		byte < short < int < long (����ǥ��)

	}

}
