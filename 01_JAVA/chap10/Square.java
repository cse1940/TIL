package chap10;

public class Square {
    public static void main(String[] args) {
        int value = 2;
        printSquare(value);
        printSquare(3);
        printSquare(value * 2);
    }

//  void 타입의 printSquare 메서드
//  int x 파라미터를 가지고 있음    
    public static void printSquare(int x) {
        System.out.println(x * x);
    }
}
