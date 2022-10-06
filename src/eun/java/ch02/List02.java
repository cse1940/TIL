package eun.java.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		
//		List�� Array�� Ȯ����
		List<String> listNames = new ArrayList<>(); // ������ : �پ��� ���·� ������
		ArrayList<String> listNames2 = new ArrayList<>();
		
		int age = (int)25L;
		
//		���� vs ��ü
		String name = "ȫ�浿";
		String name2 = new String("ȫ�浿");
		
//		���� �߰��ϱ� -> add
		listNames.add("ȫ�浿"); 
		listNames.add("����");
		
//		�� �������� -> get
		listNames.get(0);
		listNames.get(1);
//		listNames.get(2); -> error!
		
//		�� �����ϱ� -> set
		listNames.set(0, "����");
		
//		ũ�⸦ �˾Ƽ� index�� �Ѿ�� �ʴ´�
//		������ index�� ��ü ũ���� -1
		int lastIndex = listNames.size() -1;
		
//		�� �����ϱ� -> remove
		listNames.remove(0);
		listNames.remove("ȫ�浿"); // ������ index�� �̹� ������ �Ǿ��� ������ false ��ȯ(error�� �ƴ�!)
		
		System.out.println(listNames);
		
		String[] arys = listNames.toArray(new String[0]); // toArray : �迭�� �ٽ� �ٲ�(list -> array)
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1); intList.add(2); intList.add(3);
		Integer[] intary = intList.toArray(new Integer[0]);
		
//		����Ʈ�� �迭 ����
//		1. �迭�� �����
		Integer[] aryInt = new Integer[5];
		aryInt[0] = 1;
		aryInt[1] = 5;
		aryInt[2] = 2;
		aryInt[3] = 3;
		aryInt[4] = 4;
		
//		2. �迭�� ����Ʈ�� ���� -> ����Ʈ ���·� ��� ���������� ���ο��� �迭�� ũ�⸸ŭ ������
		List<Integer> newAryInt = Arrays.asList(aryInt); // asList : new ArrayList<Integer>() ��ſ� ���
		
//		3. �迭�� ����
		aryInt = newAryInt.toArray(new Integer[0]); // ����Ʈ�� �迭�� ����
		System.out.println(newAryInt);
		
//		����Ʈ�� ó������ ����Ʈ�� ������ ũ�⿡ ������ ����
//		�迭�� �̿��ؼ� ����Ʈ�� �����ϸ� �迭ó�� ũ�⿡ ������ �ִ�
//		����Ʈ�� ������ �����ϴ�

	}

}
