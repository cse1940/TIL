package com.yudong80.java.ch04;

public class StringSubstringEquals {

	public static void main(String[] args) {
		
//		1. substring() 예제
//			-> 문자열의 일부를 반환
		String poem = 
				"Two roads diverged in a yellow wood,\n" +
				"And sorry I could not travel both";
		
		String samePoem = poem.substring(0); // 인덱스 0부터 마지막까지의 내용을 반환
		String firstWord = poem.substring(0, 3); // 인덱스 0부터 2까지의 구간
		String secondLine = poem.substring(37); // 두 번째 행의 값 -> 좋은 방법은 아님
		System.out.println("시의 내용은:\n" + samePoem);
		System.out.println("시의 첫 번째 단어는: " + firstWord);
		System.out.println("시의 두 번째 줄은: " + secondLine);

//		2. equals()와 equalsIgnoreCase() 예제
//			-> 두 문자열의 내용이 같은지 확인
		String apple = "apple";
		String macintosh = "macintosh";
		String mac = "Macintosh";
		
		boolean isSame = apple.equals(mac);
		boolean isSameWord = macintosh.equalsIgnoreCase(mac);
		System.out.println(apple + "과 " + mac + "은 같은가요? " + isSame);
		System.out.println(macintosh + "와 " + mac + "은 같은 단어인가요(대소문자 무관?) " + isSameWord);
	}

}
