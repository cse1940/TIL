package basic;

public class Loop {
	
	final static int N = 30;
	final static int M = 15;

	public static void main(String[] args) {

//		1. while���� �̿��Ͽ� 1~1000������ ���� ����ϴ� ���α׷�
		int i = 1, sum = 0;
		while(i <= 1000) {
			sum += i++;
		}
		System.out.println("1���� 1000������ ���� " + sum + "�Դϴ�.");
		
//		2. for���� �̿��Ͽ� �ﰢ���� ����ϴ� ���α׷�
//		for��: �ʱ�ȭ �κ�; ���� �κ�; ���� �κ�
		for(int a = N; a > 0; a--) { // ex) a=30�� ��, b=30�̹Ƿ� 30���� *�� ��� �� �ٹٲ�
			for(int b = a; b > 0; b--) { // 
				System.out.print("*");
			}
			System.out.println();
		}
		
// 		3. for���� �̿��Ͽ� ���� ����ϴ� ���α׷�
//		x^2 + y^2 = r^2
		for(int x = -M; x <= M; x++) { // x(-15,15)
			for(int y = -M; y <= M; y++) { // y(-15,15)
				if(x*x + y*y <= M*M) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				System.out.println();
			}
		}

//		4. ���� ����
		int count = 0;
		for(;;) {
			System.out.println("���");
			count++;
			if(count == 10) {
				break;
			}
		}
	}

}
