package eun.java.ch04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Review01 {

	public static void main(String[] args) {
		
//		�迭�� �ݺ����� �̿��� ������ ����
		Random rd = new Random();
		rd.nextInt(10);
		
//		1. ������ �迭�� ��Ҹ� ������ ���ڷ� 30�� ä���ּ���(0 ~ 9)
		int[] array = new int[30];
		for(int i=0; i<array.length; i++) {
			array[i] = rd.nextInt(10);
		}
		// toString : ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� ����
		System.out.println(Arrays.toString(array)); 
		
//		2. �迭 �� �� ���ڰ� �� �� �ݺ��Ǿ����� count
//		��Ʈ : �迭�� index �̿��� ��� -> count �ϴ� ���ο� �迭 �ʿ�
		int[] ary = new int[10]; // 0���� �ڵ� �ʱ�ȭ
		for(int i=0; i<array.length; i++) {
			ary[array[i]]++;
		}
		for(int i=0; i<ary.length; i++) {
			System.out.printf("[%d : %d] ", i, ary[i]);
		}
		System.out.println();
		
//		3. �ݴ�� �� ���� �ȳ��� ���ڴ�?
//		Map<Integer, Integer> maps = new HashMap<>(Arrays.asList(array));
		
		
//		4. ��ǻ�Ͱ� 100 ���� �ڿ��� �� �����ϰ� ��ȣ�� �����ϰ� ����ڰ� ���ߴ� ����
//		���� �� ���� ���� ����, ���߸� �� ������ �������? -> while(true)
		int number = rd.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.println("���ڸ� �Է��� �ּ���: ");
			int number2 = sc.nextInt();
			if(number < number2) {
				System.out.println("�� ���� ���� �Է��� �ּ���.");
			} else if(number > number2) {
				System.out.println("�� ū ���� �Է��� �ּ���.");
			} else {
				System.out.println("�����Դϴ�.");
				break;
			}
			count++;
		}
		System.out.println("�� ������ ���質��?" + count);

	}

}
