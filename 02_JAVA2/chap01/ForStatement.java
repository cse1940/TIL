package chap01;

public class ForStatement {
    public static void main(String[] args) {
        int n = Integer.parseInt("7");

        printNumbers(n);
    }

    public static void printNumbers(int max) {
        System.out.println("출력을 시작합니다..");

        for(int i=1; i<max+1; i++) {
            System.out.printf("%d..\n", i);
        }

        System.out.println("\n끝!");
    }
}
