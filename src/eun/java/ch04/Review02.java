package eun.java.ch04;

public class Review02 {

	public static void main(String[] args) {

		int[] ary = {10, 20, 30, 40, 50};
		System.out.println(ary[0]);
		
//		�迭 ��ҿ� ���� �����ϴ� ���� i�� �迭�� index ��ȣ
//		int i�� �迭 index
		for(int i=0; i<ary.length; i++) {
			
		}
		
//		�迭 ��Ҹ� for���� �˾Ƽ� �����ͼ� ���� i�� ���� ������ -> index ���� X
//		int i�� �迭 ����� ��
		for(int i : ary) {
			i = 100;
		}

	}

}
