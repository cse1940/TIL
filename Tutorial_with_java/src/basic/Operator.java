package basic;

public class Operator {
	
	final static int SECOND = 1000;
 
	public static void main(String[] args) {

//		�ʸ� �Է� �޾� �� �� �� ������ ����ϴ� ���α׷�
		int minute = SECOND / 60; // ��
		int second = SECOND % 60; // ������
		
		System.out.println("1000s = " + minute + "��" + second + "��");
		
// 		++, --�� �̿��� ���α׷�(����������)
		int a = 10;
		System.out.println("������ a�� " + a + "�Դϴ�.");
		a++;
		System.out.println("������ a�� " + a + "�Դϴ�.");
		System.out.println("������ a�� " + ++a + "�Դϴ�.");
		System.out.println("������ a�� " + a++ + "�Դϴ�.");
		System.out.println("������ a�� " + a + "�Դϴ�.");
		
//		%�����ڸ� �̿��� ���α׷�
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
// 		==, >, <, &&, ||, !������ �̿��� ���α׷�
		int b = 50;
		int c = 50;
		
		System.out.println("a�� b�� ��������? " + (a==b));
		System.out.println("a�� b���� ū����? " + (a>b));
		System.out.println("a�� b���� ��������? " + (a<b));
		System.out.println("a�� b�� �����鼭 30���� ū����?? " + ((a==b) && (a>b)));
		System.out.println("a�� 50�� �ƴѰ���? " + !(a==50));

	}

}
