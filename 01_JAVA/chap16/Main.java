package chap16;

public class Main {
    public static void main(String[] args) {
//      입력
        int M = Integer.parseInt("3");
        int N = Integer.parseInt("5");

//      중첩된 반복문
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
