package eun.java.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_Set {

	public static void main(String[] args) {
		
//		list와 set의 응용
//		두 집합은 서로 교환이 가능함
		
//		중복을 허용하는 리스트를 만들고
		List<Integer> lists = new ArrayList<>(Arrays.asList(5, 4, 8, 7, 9, 1, 5, 4, 7, 1, 2, 4));

//		출력해서 확인하고
		System.out.println(lists);
		
//		중복을 허용하지 않는 set를 만드는데, 데이터는 기존의 lists가 가지고 있는 데이터로 함
//		그러면 중복을 제거한 결과를 sets가 가지게 됨
		Set<Integer> sets = new HashSet<>(lists);
		System.out.println(sets);
		
//		중복을 제거한 sets의 값으로 원래 lists에다가 다시 새롭게 만들어서 넣어줌
		lists = new ArrayList<>(sets);
		
//		결국은 리스트의 중복을 제거한 결과를 얻을 수 있음
		System.out.println(lists);

	}

}
