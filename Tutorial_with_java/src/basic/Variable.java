package basic;

public class Variable {
	
	final static double PI = 3.141592;
	final static int INT_MAX = 2147483647;

	public static void main(String[] args) {

//		1. ����		
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "�ֽ���";
		 
		System.out.println("intType = " + intType);
		System.out.println("doubleType = " + doubleType);
		System.out.println("stringType = " + stringType);
		
//		2. ���
		int r = 30;
		System.out.println("���� ������ = " + r * r * PI);
		
//		3. overflow		
		int a = INT_MAX;
		System.out.println("a = " + a);
		System.out.println("a+1 = " + (a+1));
		
//		4. ��Ģ����
		int b = 1;
		int c = 2;
		System.out.println("b+c = " + (b+c));
		System.out.println("b-c = " + (b-c));
		System.out.println("b*c = " + (b*c));
		System.out.println("b/c = " + (b/c));


	}

}
