package eun.java.ch04;

public class WhileDemo03 {

	public static void main(String[] args) {
		
//		1. ������ �迭�� ����鼭 ���� 1 ~ 10 ���� �迭
//		2. �� �迭�� ���� �����ؼ� ¦���� ��� -> ���ǹ�
//		3. while�� ���ǹ��� ����ؼ� ó��
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int i = 0;
		while(i < array.length) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
			i++;
		}

	}

}
