package eun.java.ch04;

public class WhileDemo07 {

	public static void main(String[] args) {
		
		int i = 2;
		while(i < 10) {
			int column = 1, row = i; // column : 가로, row : 세로
			while(column < 10) {
				System.out.printf("%4d", row * column);
				column++;
			}
			i++;
			System.out.println();
		}

	}

}
