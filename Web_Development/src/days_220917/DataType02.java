package days_220917;

public class DataType02 {

	public static void main(String[] args) {
// 		boolean�� ������ Ÿ��
//		�������� ���� �� ����Ģ
//		1. ���ڷ� �������� �ʴ´�.
//		2. ������� �ý����� �����ϰ� �ִ� �ܾ ������� �ʴ´�.
//		3. �������� �����Ӱ� ���峪, �ǹ̸� �ִ��� �츰��.
		
		boolean isSuccess = false;
		System.out.println(isSuccess);
		System.out.println(!isSuccess);
		isSuccess = !isSuccess;
		
		boolean trueOrFalse = false;
		System.out.println(2 > 1);
		
		trueOrFalse = 2 > 1;
		System.out.println("trueOrFalse = 2 > 1 " + trueOrFalse);
		trueOrFalse = 2 < 1;
		System.out.println("trueOrFalse = 2 < 1 " + trueOrFalse);
		trueOrFalse = 2 == 1;
		System.out.println("trueOrFalse = 2 == 1 " + trueOrFalse);
		trueOrFalse = 2 != 1;
		System.out.println("trueOrFalse = 2 != 1 " + trueOrFalse);
		trueOrFalse = !(2 > 1);
		System.out.println("trueOrFalse = !(2 > 1) " + trueOrFalse);
		
		System.out.println(""+100+200);
		
//		�� or ���� �Ǵ� -> �񱳿����ڸ� ���ؼ� �Ѵ�.
//		���ڿ� �񱳴�(����, ���� �ʴ�) �Լ��� �̿�
		System.out.println("100" == "100");
		System.out.println("100".equals("100"));
		System.out.println("hello" == "hello");
		System.out.println("hello".equals("hello"));

	}

}
