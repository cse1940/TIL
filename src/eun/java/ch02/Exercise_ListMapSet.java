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
		
//		1. 3명의 학생이 있다고 가정하고, 각각 이름과 번호를 부여해서 관리한다.
//		   홍길동, 김철이, 최미애, 최미애
//		   전학생이 옴 -> 최승은 추가
//		   전학을 감 -> 최미애 중 한 명 삭제
		Map<Integer, String> school = new HashMap<>();
		
		school.put(1, "홍길동");
		school.put(2, "김철이");
		school.put(3, "최미애");
		school.put(4, "최미애");
		
		school.put(5, "최승은");
		
		school.remove(3);
		
		System.out.println(school);
		
//		2. [1, 3, 5, 7, 9, 12, 15] list를 만들고 [5, 15] 추가
		List<Integer> number = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 12, 15));
		
		number.add(5); number.add(15);
		
		System.out.println(number);

//		3. list에 있는 데이터를 이용해서 set을 구성
		Set<Integer> numbers = new HashSet<>(number);
		
		System.out.println(numbers);
		


	}

}
