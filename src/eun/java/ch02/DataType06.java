package eun.java.ch02;

public class DataType06 {

	public static void main(String[] args) {
		
//		���ڿ� formating
//		1. %f : �Ǽ� �������ִ� ������
//		2. %c : ���� �������ִ� ������
//		3. %d : ������ �������ִ� ������
//		4. %s : ���ڿ� �������ִ� ������
//		5. %b : boolean �ڷ��� �������ִ� ������
		
		double applePrice = 5.25, bananaPrice = 0.50;
		String result = String.format("Today's apple price %.2f, banana %f best fruit is %s",
							applePrice, bananaPrice, "fineApple");
		System.out.println(result);

	}

}
