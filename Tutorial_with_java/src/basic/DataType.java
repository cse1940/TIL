package basic;

public class DataType {

	public static void main(String[] args) {

// 		double���� �̿��� ����� ���ϴ� ���α׷�
		double a = 10.3;
		double b = 9.6;
		double c = 14.2;
		
		System.out.println("(a+b+c) / 3) = " + (a+b+c) / 3);
		
//		ascii�ڵ� ����� char���� �̿��� a~z ����ϴ� ���α׷�
		for(char i='a'; i<='z'; i++) {
			System.out.print(i + " ");
		}
			
//		10������ 8���� or 16������ �ٲپ� ����
		int d = 200;
		System.out.println("\n10���� : " + d);
		System.out.format("8���� : %o\n", d);
		System.out.format("16���� : %x", d);
		
//		String�� substring �Լ��� Ȱ���� ����
		String name = "Seung Eun";
		System.out.println(name);
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(3, 6));

	}

}
