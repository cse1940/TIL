package eun.java.ch05;

public class ReturnDemo {

	public static void main(String[] args) {
		
		printScore(99);
		printScore(120);

	}
	
	public static void printScore(int score) {
		if(score < 0 || score > 100) {
			System.out.println("0 �̸� �Ǵ� 100 �ʰ� " + score);
			return;
		}
		System.out.println("0 ~ 100 ����" + score);
	}

}
