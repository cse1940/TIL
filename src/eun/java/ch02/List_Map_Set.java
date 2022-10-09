package eun.java.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class List_Map_Set {

	public static void main(String[] args) {
		
//		list, map, set의 기능
		
//		list와 set은 서로 단일 데이터를 저장하는 공통점을 가짐
//		list : 넣는대로 저장, 순서 보장함
//		set : 중복을 허용하지 않고 순서 보장함 -> 교집합(retainAll), 합집합(addAll), 차집합(removeAll)의 개념을 가짐
//		list와 set은 서로 요소로 해서 만들 수 있음
		List<Integer> li = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3)); 
		System.out.println(li);
		
		Set<Integer> se = new HashSet<>(li);
		System.out.println(se);
		
//		Map은 key : value가 하나의 원소임
//		key만 출력, value만 출력
//		key에 해당하는 속성은 set의 속성임 -> 중복 불가
		Map<Integer, String> names = new HashMap<>();
		
//		위 3개는 공통적으로 contains을 가지고 있음

	}

}
