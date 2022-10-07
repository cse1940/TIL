package eun.java.ch04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WhileDemo06 {

	public static void main(String[] args) {
		
//		1. map 데이터를 적당히 만들고
//		2. while 이용해서 key : value 값 출력
		Map<Integer, String> maps = new HashMap<Integer, String>();
		maps.put(001, "최승은"); maps.put(002, "이지은"); maps.put(003, "최백순");
		
//		key 값 list 뽑기
		Set<Integer> keys = maps.keySet();
		
		List<Integer> lists = new ArrayList<Integer>(keys);
		
		int i = 0;
		while(i < lists.size()) {
			System.out.println(lists.get(i) + " : " + maps.get(lists.get(i)));
			i++;
		}

	}

}
