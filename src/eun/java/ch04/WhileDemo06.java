package eun.java.ch04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WhileDemo06 {

	public static void main(String[] args) {
		
//		1. map �����͸� ������ �����
//		2. while �̿��ؼ� key : value �� ���
		Map<Integer, String> maps = new HashMap<Integer, String>();
		maps.put(001, "�ֽ���"); maps.put(002, "������"); maps.put(003, "�ֹ��");
		
//		key �� list �̱�
		Set<Integer> keys = maps.keySet();
		
		List<Integer> lists = new ArrayList<Integer>(keys);
		
		int i = 0;
		while(i < lists.size()) {
			System.out.println(lists.get(i) + " : " + maps.get(lists.get(i)));
			i++;
		}

	}

}
