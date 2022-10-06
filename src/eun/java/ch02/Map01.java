package eun.java.ch02;

import java.util.HashMap;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		
//		Map이란 딕셔너리 같은 존재
//		key : value

//		국영수의 점수 관리를 어떻게 해야 할까?
//		1. 국어 변수, 영어 변수, 수학 변수
//		2. array {국어, 영어, 수학}
//		3. list로 관리하면 과목이 늘어나도 상관이 없음
//		4. 하지만 단점은 국어 점수가 몇 번째에 저장되어 있는 점수인가?
		
//		만들고	
		Map<String, Integer> map = new HashMap<>();
		
//		추가하고
		map.put("국어", 98);
		map.put("영어", 90);
		map.put("수학", 80);
		System.out.println(map);
		
//		읽고
		System.out.println("국어 점수는 " + map.get("국어") + "점 입니다.");

//		수정하고
		map.put("국어", 100);
		System.out.println("국어 점수는 " + map.get("국어") + "점 입니다.");
		
//		삭제하고
		map.remove("국어"); // 국어롤 key로 하는 요소가 삭제됨
		System.out.println(map);
		
//		그 외 자주 사용하는 기능들
		System.out.println("map의 크기는 " + map.size() + "입니다.");
		
//		key 출력
		System.out.println("key는 " + map.keySet());
		
//		value 출력
		System.out.println("value는 " + map.values());
		
//		특정값이 들어 있는지 확인
		System.out.println("key값이 수학인 데이터가 있나요? " + map.containsKey("수학"));
		System.out.println("value값이 95인 데이터가 있나요? " + map.containsValue(95));

	}

}
