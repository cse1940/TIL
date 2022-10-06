package eun.java.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		
//		List는 Array의 확장판
		List<String> listNames = new ArrayList<>(); // 다형성 : 다양한 형태로 존재함
		ArrayList<String> listNames2 = new ArrayList<>();
		
		int age = (int)25L;
		
//		변수 vs 객체
		String name = "홍길동";
		String name2 = new String("홍길동");
		
//		값을 추가하기 -> add
		listNames.add("홍길동"); 
		listNames.add("수원");
		
//		값 가져오기 -> get
		listNames.get(0);
		listNames.get(1);
//		listNames.get(2); -> error!
		
//		값 수정하기 -> set
		listNames.set(0, "서울");
		
//		크기를 알아서 index를 넘어가지 않는다
//		마지막 index는 전체 크기의 -1
		int lastIndex = listNames.size() -1;
		
//		값 삭제하기 -> remove
		listNames.remove(0);
		listNames.remove("홍길동"); // 위에서 index로 이미 삭제가 되었기 때문에 false 반환(error는 아님!)
		
		System.out.println(listNames);
		
		String[] arys = listNames.toArray(new String[0]); // toArray : 배열로 다시 바꿈(list -> array)
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1); intList.add(2); intList.add(3);
		Integer[] intary = intList.toArray(new Integer[0]);
		
//		리스트와 배열 응용
//		1. 배열을 만든다
		Integer[] aryInt = new Integer[5];
		aryInt[0] = 1;
		aryInt[1] = 5;
		aryInt[2] = 2;
		aryInt[3] = 3;
		aryInt[4] = 4;
		
//		2. 배열을 리스트로 변경 -> 리스트 형태로 사용 가능하지만 내부에서 배열의 크기만큼 고정됨
		List<Integer> newAryInt = Arrays.asList(aryInt); // asList : new ArrayList<Integer>() 대신에 사용
		
//		3. 배열로 변경
		aryInt = newAryInt.toArray(new Integer[0]); // 리스트를 배열로 변경
		System.out.println(newAryInt);
		
//		리스트는 처음부터 리스트로 만들어야 크기에 제한이 없다
//		배열을 이용해서 리스트를 생성하면 배열처럼 크기에 제한이 있다
//		리스트는 정렬이 가능하다

	}

}
