package eun.java.ch02;

public class DataType01 {

	public static void main(String[] args) {
		
		int age = 10; // ���� ����� ���ÿ� �ʱ�ȭ
		int age2 = age; // ���� ����� ���ÿ� �ʱ�ȭ
		
		int age3; // ���� ����
		age3 = 0; // ���� �� �ʱ�ȭ
		
		int age4 = age3;
		
		long lage = 0;
		lage = age4; // auto casting -> �ڵ��� ����ȯ(��<ū)
		age4 = (int)lage; // manual casting -> ����ȯ �ʿ���(ū<��)
		
		int in1 = 100;
		long lo1 = 1000;
		short sh1 = 10;
		byte by1 = 1;
		char ch1 = 65; // ���ڸ� ǥ���ϴ� ascii �ڵ�
		
		System.out.println(in1);
		System.out.println(lo1);
		System.out.println(sh1);
		System.out.println(by1);
		System.out.println(ch1);
		
//		byte < short < int < long


	}

}
