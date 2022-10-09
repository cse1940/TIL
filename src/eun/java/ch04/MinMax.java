package eun.java.ch04;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class MinMax {

	public static void main(String[] args) {
		
//		���̺귯���� ������� �ʰ� �־��� �������� ���տ��� �ִ񰪰� �ּڰ��� ã�ƺ���
		Random rd = new Random();
		System.out.println(rd.nextInt(100)); // 0 ~ 100 ������ ���ڸ� �����ϰ� ����
		
//		1. ���� 10���� �����ؼ� ������ �迭�� ��� �迭���� randomAry10
		int[] randomAry10 = new int[10];
		for(int i=0; i<randomAry10.length; i++) {
			randomAry10[i] = rd.nextInt(100);
		}

//		�������� �Էµ� �� ���
		System.out.print("���� �迭�� ��ҵ�: ");
		for(int i : randomAry10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		2. �迭 �� ¦���� ���
		System.out.print("¦��: ");
		for(int i : randomAry10) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			} i++;
		}
		System.out.println();
		
//		3. �� �迭�� ���� ������� ���ϴµ� �� ���� 100�� �ѱ�� ���� index ���
		int count = 0;
		for(int i=0; i<randomAry10.length; i++) {
			count += randomAry10[i];
			if(count > 300) {
				System.out.println("��������� ���� " + count + ", index�� " + i);
				break;
			}
		}
		
//		4. �迭�� �ִ񰪰� �ּڰ�
		int min = randomAry10[0], max = randomAry10[0];
		for(int i : randomAry10) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		System.out.println("�迭�� �ִ��� " + max +", �ּڰ��� " + min + "�Դϴ�.");
	}

}
