package basic;

public class Conditional {

	public static void main(String[] args) {

//		1. if���� �̿��Ͽ� ���ڿ��� Ư�� ���ڿ��� �����ϴ��� Ȯ���ϴ� ���α׷�
		String a = "I Love You!";
		if(a.contains("Love")) {
//			�����ϴ� ��� ����Ǵ� �κ�
			System.out.println("Me Too!");
		} else {
//			�������� �ʴ� ��� ����Ǵ� �κ�
			System.out.println("I Hate You!");
		}
		
//		2. ������ ���� �ٸ� �޼����� ����ϴ� ���α׷�
		int score = 95;
		if(score >= 90) {
			System.out.println("A+�Դϴ�.");
		} else if(score >= 80) {
			System.out.println("B+�Դϴ�.");
		} else if(score >= 7) {
			System.out.println("C+�Դϴ�.");
		} else {
			System.out.println("F�Դϴ�.");
		}
		
//		3. ���ڿ��� �������� ���� ���ǹ��� �̿��� ����
		String name = "Man";
		int b = 0;
//		�ڹٴ� String�� ���� �� .equals�� �̿��մϴ�.
//		String�� �ٸ� �ڷ����� �ٸ� ���ڿ� �ڷ����̱� �����Դϴ�.
		if(name.equals("Man")) {
			System.out.println("����� �����Դϴ�.");
		} else {
			System.out.println("����� �����Դϴ�.");
		}
		
		if(b == 3) {
			System.out.println("b�� 3�Դϴ�.");
		} else {
			System.out.println("b�� 3�� �ƴմϴ�.");
		}
		
		if(name.equalsIgnoreCase("man") && b == 0) {
			System.out.println("���Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}

	}

}
