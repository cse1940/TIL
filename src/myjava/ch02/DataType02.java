package myjava.ch02;

public class DataType02 {

	public static void main(String[] args) {
		
//			boolean�� ���� ���� �� �ʱ�ȭ
//			�������θ� �Ǵ��ϴ� ����(true or false)
//			�ڹٿ����� �������� ���� �� ����Ģ�� ī�����̽��� ����
//			�����ܾ ������ �ϳ��� �ܾ�� ǥ���� ��,
//			ù �ܾ�� �ҹ��ڷ� �� �������ʹ� ù���ڸ� �빮�ڷ�
//			�������� �����Ӱ� ����� �� ������ �����ְ� �ȴ�.
//			�������� �ǹ̸� �ִ��� �츰��.
//			1. ���ڷ� �������� �ʴ´�.
//			2. ������� �ý����� �����ϰ� �ִ� �ܾ ������� �ʴ´�.
		
			boolean isSuccess = false;
			System.out.println(isSuccess);
			System.out.println(!isSuccess);
			
			System.out.println(2 > 1);
			
			boolean trueOrFalse = 2 > 1;
			System.out.println("trueOrFalse�� 2 > 1 �̹Ƿ� " + trueOrFalse + "�Դϴ�.");
			trueOrFalse = 2 < 1;
			System.out.println("trueOrFalse�� 2 < 1 �̹Ƿ� " + trueOrFalse + "�Դϴ�.");
			trueOrFalse = (2 == 1);
			System.out.println("trueOrFalse�� 2 == 1 �̹Ƿ� " + trueOrFalse + "�Դϴ�.");
			trueOrFalse = (2 != 1);
			System.out.println("trueOrFalse�� 2 != 1 �̹Ƿ� " + trueOrFalse + "�Դϴ�.");
			trueOrFalse = !(2 < 1);
			System.out.println("trueOrFalse�� !(2 < 1) �̹Ƿ� " + trueOrFalse + "�Դϴ�.");
			
			System.out.println(100 + "" + 200); // ���ڸ� ���ڿ��� ��ġ�� ���
			
//			���� ������ �Ǵ��� ���� �񱳿����� == �� ���� 
//			���ڿ� �񱳴�(����, ���� �ʴ�) .equals() �Լ��� �̿��ϴ� ���� ��õ
//			���������̼����� ���� ����� ������ ����� �ȴ� �׸��� ������ ����	
			
			System.out.println("100" == "100");
			System.out.println("100".equals("100"));
			
			System.out.println("hello" == "hello");
			System.out.println("hello".equals("hello"));

	}

}
