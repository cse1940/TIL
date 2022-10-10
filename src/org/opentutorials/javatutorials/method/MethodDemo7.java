package org.opentutorials.javatutorials.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*; // ����

public class MethodDemo7 {

	public static void main(String[] args) {
		
		String result = numbering(1, 5);
		System.out.println(result);
		try { // ����
			// ���� ���� out.txt ��� ���Ͽ� numbering�̶�� �޼ҵ尡 ��ȯ�� ���� �����մϴ�
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
		} // ����
		
	}
	
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i < limit) {
			output += i;
			i++;
		}
		return output;
	}
	
//	�ڵ忡�� ���ö�� ǥ�õ� �κ��� ���� �ܰ迡���� �����ϱ� ����� ��
//	�߿��� ���� numbering�̶�� �޼ҵ�κ��� ȭ�鿡 ����̶�� ��ü���� ������ 
//	�����ϰ� ��ſ� ó�� ����� ��ȯ�ϰ� �ִٴ� ����̴�

}
