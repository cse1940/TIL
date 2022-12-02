package chap11;

public class SquareChange {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("main x = " + x); // 5
        printSquare(x);
        System.out.println("main x = " + x); // 5
    }

    public static void printSquare(int x) { // x = 5
        System.out.println("printSquare x = " + x); // 5
        x = x * x;
        System.out.println("printSquare x = " + x); // 25
    }
}
