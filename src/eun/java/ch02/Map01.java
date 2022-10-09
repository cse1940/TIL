package eun.java.ch02;

import java.util.HashMap;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		
//		Map�̶� ��ųʸ� ���� ����
//		key : value

//		�������� ���� ������ ��� �ؾ� �ұ�?
//		1. ���� ����, ���� ����, ���� ����
//		2. array {����, ����, ����}
//		3. list�� �����ϸ� ������ �þ�� ����� ����
//		4. ������ ������ ���� ������ �� ��°�� ����Ǿ� �ִ� �����ΰ�?
		
//		�����	
		Map<String, Integer> map = new HashMap<>();
		
//		�߰��ϰ�
		map.put("����", 98);
		map.put("����", 90);
		map.put("����", 80);
		System.out.println(map);
		
//		�а�
		System.out.println("���� ������ " + map.get("����") + "�� �Դϴ�.");

//		�����ϰ�
		map.put("����", 100);
		System.out.println("���� ������ " + map.get("����") + "�� �Դϴ�.");
		
//		�����ϰ�
		map.remove("����"); // ����� key�� �ϴ� ��Ұ� ������
		System.out.println(map);
		
//		�� �� ���� ����ϴ� ��ɵ�
		System.out.println("map�� ũ��� " + map.size() + "�Դϴ�.");
		
//		key ���
		System.out.println("key�� " + map.keySet());
		
//		value ���
		System.out.println("value�� " + map.values());
		
//		Ư������ ��� �ִ��� Ȯ��
		System.out.println("key���� ������ �����Ͱ� �ֳ���? " + map.containsKey("����"));
		System.out.println("value���� 95�� �����Ͱ� �ֳ���? " + map.containsValue(95));

	}

}
