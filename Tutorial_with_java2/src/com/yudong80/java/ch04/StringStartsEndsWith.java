package com.yudong80.java.ch04;

public class StringStartsEndsWith {

	public static void main(String[] args) {

//		1. startsWith()
//			-> 대상 문자열이 인자로 입력받은 문자열로 시작하는지 여부 확인
		String[] poem = {
				"Two roads diverged in a yellow wood",
				"And sorry I could not travel both",
				"And be one traveller, long I stood",
		};
		
		for(int i=0; i<poem.length; ++i) {
			String line = poem[i];
			boolean startsWithAnd = line.startsWith("And");
			System.out.println((i+1) + "번째 줄은 And로 시작하나요? " + startsWithAnd);
		}
		
//		2. endsWith()
//			-> 대상 문자열이 인자로 입력받은 문자열로 끝나는지 여부 확인
		for(int i=0; i<poem.length; ++i) {
			String line = poem[i];
			boolean endsWithOod = line.endsWith("ood");
			System.out.println((i+1) + "번째 줄은 ood로 끝나나요? " + endsWithOod);
		}

	}

}
