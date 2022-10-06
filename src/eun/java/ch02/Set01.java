package eun.java.ch02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
//		Set은 list와 동일하다
//		1. 중복은 허용하지 않는다 즉, 중복 데이터를 저장하면 하나만 저장된다
//		2. 입력 순서를 보장하지 못 한다
		
//		데이터 추가, 삭제, 읽기
//		교집합, 합집합, 차집합 개념
		Set<Integer> ss = new HashSet<>();
		
		ss.add(1); ss.add(2); ss.add(3); ss.add(2); ss.add(2);
		System.out.println("ss에 저장되어 있는 값들은 " + ss + " 입니다.");
		ss.remove(1);
		System.out.println("ss에 저장되어 있는 값들은 " + ss + " 입니다.");
		
//		교집합
		Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5, 10, 12));
//		Set<Integer> s3 = s1; -> error
		Set<Integer> s3 = new HashSet<>(s1);
		
		System.out.println(s3.retainAll(s2));
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("교집합 s3 : " + s3);
		
//		합집합
		s3.clear(); // 초기화
		s3 = new HashSet<>(s1);
		s3.addAll(s2);
		System.out.println("합집합 s3 : " + s3);
		
//		차집합
		s3.clear(); // 초기화
		s3 = new HashSet<>(s1);
		s3.removeAll(s2);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("차집합 s3 : " + s3);

	}

}
