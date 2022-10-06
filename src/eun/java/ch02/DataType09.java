package eun.java.ch02;

public class DataType09 {

	public static void main(String[] args) {
		
// 		Array 
// 		동일한 타입이면서 동일한 형태나 속성을 가지는 값들을 모아 놓은 것
		
// 		국어, 영어, 수학 과목의 점수를 저장하기 위해서는 적어도 3개의 변수가 필요
//		그런데 그게 한 사람의 점수라면? 사람과 점수를 1:1로 매칭하고 싶을 때는?
		int korean = 100, english = 100, math = 100;
		int korean1 = 100, english1 = 100, math1 = 100;
		
//		배열은 동일한 데이터 타입만 관리가 가능함
		int[] ary = {10, 20, 30}; // 생성과 동시에 초기화하는 경우 자동으로 초기화한 갯수가 배열의 크기가 됨
		ary[0] = 100;
		
//		모든 데이터 타입은 배열이 가능함
//		모든 배열은 크기가 정해져 있고 고정된 길이임
//		그래서 배열을 만들 때 크기를 정한다
		int[] ary2 = new int[3];
		System.out.println(ary2[0]);
		
		int[] student = {100, 100, 100};
		int student1[] = {100, 100, 100};

	}

}
