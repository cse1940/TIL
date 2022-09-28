package com.yudong80.java.ch04;

public class NumberFilter {
	
	static String filterZeros(String input) {
//		3. 0�� ������ ��ġ ���ϱ�
		int lastIndex = input.lastIndexOf("0");
		
//		4. 0�� ���ŵ� ���ڿ� ��ȯ�ϱ�
		String res = input.substring(lastIndex +1);
		return res;
	}
	
	public static void main(String[] args) {

//		1. �Է� ������
		String[] data = {
				"000999",
				"00000003333",
				"888",
		};
		
//		2. �ʴ� ��� ����ϱ�
		for(String input : data) {
			System.out.println(filterZeros(input));
		}

	}

}
