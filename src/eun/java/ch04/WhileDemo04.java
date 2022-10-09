package eun.java.ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhileDemo04 {

	public static void main(String[] args) {
		
//		정수형 리스트를 만들어 값을 1 ~ 10 저장
		List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
//		lists.get(0) -> index 0에 해당하는 값이 출력
		int i = 0; // 순환문을 제어하는 역할
		while(i < lists.size()) {
			if(lists.get(i) % 2 == 0) {
				System.out.print(lists.get(i) + " ");
			}
			i++;
		}
	}

}
