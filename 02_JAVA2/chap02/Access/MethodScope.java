package Access;

public class MethodScope {
    public static void main(String[] args) {
//      main 메서드의 지역변수 score        
        int score = 88;
        System.out.printf("score = %d in main()\n", score);

        Record.foo(score);

        System.out.printf("score = %d in main()\n", score);
    }
}

class Record {
    public static void foo(int score) {
        score -= 10;
        System.out.printf("score = %d in foo()\n", score);
    }
}
