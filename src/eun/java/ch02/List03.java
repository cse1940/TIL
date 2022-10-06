package eun.java.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		
//		list는 정렬 가능
//		array는 정렬 불가능
		
		Integer[] ary = {5, 2, 3, 7, 1}; // 정수형 배열 초기화
		System.out.println(ary[0]);
		
		List<Integer> lists = Arrays.asList(ary); // ary 배열을 list로 변환
		System.out.println(lists);
		
		lists.sort(null); // 기본이 오름차순
		System.out.println(lists); 
		lists.sort(Comparator.reverseOrder()); // 내림차순
		System.out.println(lists);
		ary = lists.toArray(new Integer[0]); // 리스트를 배열로 변경
		System.out.println(ary[0]);
		
//		특정값이 배열에 있는지 조사
		System.out.println(lists.contains(5));
		
//		배열의 값을 바로 다 출력하고 싶다면
		String[] aryStr = {"aaa", "bbb", "ccc"};
		System.out.println(aryStr);
		System.out.println(Arrays.asList(aryStr)); // aryStr 배열을 list로 변환
		
//		배열에 있는 각각의 요소를 특정 문자를 기준으로 합쳐줌 -> String.join
		System.out.println(String.join(",", aryStr));
		
//		리스트는 모든 데이터 타입을 지원
//		1. 만들 때 저장할 타입을 지정
//		2. 정렬을 지원
//		3. contains을 이용해서 값의 존재유무를 파악
//		Arrays.asList()를 이용해서 기본 데이터 타입 배열을 리스트로 변환이 가능
//		오리지널 배열이 할 수 없는 기능을 메소드 하나로 지원
//		대표적으로 정렬(sort), 전체 데이터 출력(리스트 객체 자체를 출력)
//		리스트는 다시 배열로 변경 -> toArray(new 변경할클래스[0]);
	}

}
