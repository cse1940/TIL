package basic;

public class Array2D {

	public static void main(String[] args) {

//		1. 10 * 10의 정수 랜덤 데이터를 생성하여 전제 데이터를 분석하는 프로그램
		int N = 50;
		int[][] array = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				array[i][j] = (int)(Math.random() * 10);
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
