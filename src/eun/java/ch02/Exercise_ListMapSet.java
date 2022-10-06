package eun.java.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise_ListMapSet {

	public static void main(String[] args) {
		
//		1. 3���� �л��� �ִٰ� �����ϰ�, ���� �̸��� ��ȣ�� �ο��ؼ� �����Ѵ�.
//		   ȫ�浿, ��ö��, �ֹ̾�, �ֹ̾�
//		   ���л��� �� -> �ֽ��� �߰�
//		   ������ �� -> �ֹ̾� �� �� �� ����
		Map<Integer, String> school = new HashMap<>();
		
		school.put(1, "ȫ�浿");
		school.put(2, "��ö��");
		school.put(3, "�ֹ̾�");
		school.put(4, "�ֹ̾�");
		
		school.put(5, "�ֽ���");
		
		school.remove(3);
		
		System.out.println(school);
		
//		2. [1, 3, 5, 7, 9, 12, 15] list�� ����� [5, 15] �߰�
		List<Integer> number = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 12, 15));
		
		number.add(5); number.add(15);
		
		System.out.println(number);

//		3. list�� �ִ� �����͸� �̿��ؼ� set�� ����
		Set<Integer> numbers = new HashSet<>(number);
		
		System.out.println(numbers);
		


	}

}
