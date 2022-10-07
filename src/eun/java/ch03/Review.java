package eun.java.ch03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Review {

	public static void main(String[] args) {
		
//		배열(collection)
//		1. List
//		2. Map
//		3. Set
	
//		조건문
//		1. if
//		2. switch
		
//		원소가 5개인 임의의 정수형 배엶을 만들고 적당한 값으로 초기화
		int[] number = {1, 2, 3, 4, 5};
		
		int[] number2 = new int[5];
		number2[0] = 1; number[1] = 2; number[2] = 3; number[3] = 4; number[4] = 5;
		
//		마지막 index 배열의 크기 -1
		System.out.println("마지막 index는 " + (number.length -1) + "입니다.");
		
//		정수형 데이터를 저장할 수 있는 list와 set을 정의하고 데이터를 한 두개 입력
//		학번과 이름을 하나의 원소로 갖는 map을 정의하고 적당한 데이터를 입력
		List<Integer> lists = new ArrayList<>();
		lists.add(100); lists.add(200);
		System.out.println(lists);
		
		Set<Integer> sets = new HashSet<>(lists);
		sets.add(100); sets.add(300);
		System.out.println(sets);
		
		Map<Integer, String> maps = new HashMap<>();
		maps.put(2019144044, "최승은"); maps.put(2019144049, "홍수현");
		System.out.println(maps);
		
		if(number.length > 10) {
			System.out.println("배열의 크기는 10보다 큽니다.");
		} else if(number.length > 5) {
			System.out.println("배열의 크기는 5보다 크고 11보다 작습니다.");
		} else {
			System.out.println("배열의 크기는 6보다 작습니다.");
		}
		
		if(number.length > 10 && number2.length > 5) {
			System.out.println("성공입니다.");
		} else {
			System.out.println("다시 시도해 주세요.");
		}
		
		if(number.length > 10 || number2.length > 5) {
			System.out.println("성공입니다.");
		} else {
			System.out.println("다시 시도해 주세요.");
		}
		
//		case by case
		int value = 0;
		switch(value) {
		case 0:
			System.out.println("캐릭터가 레벨업을 할 수 없습니다.");
			break;
		case 1:
			System.out.println("캐릭터가 1레벨업을 할 수 있습니다.");
			break;
		default:
			System.out.println("다시 입력해 주세요.");
			break;
		}

	}

}
