package chap01;

public class GuGuDan {
    public static void main(String[] args) {
        printGuGuDan();
    }

//  구구단 출력 메서드
    public static void printGuGuDan() {
        for(int dan=2; dan<=9; dan++) {
            printDan(dan);
        }
    }

//  dan 출력 메서드
    public static void printDan(int dan) {
        System.out.printf("%d단\n", dan);

        for(int i=1; i<10; i++) {
            System.out.print("\t");
            System.out.printf("%d X %d = %d\n", dan, i, dan*i);
        }
    }
}
