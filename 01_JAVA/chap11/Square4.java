package chap11;

public class Square4 {
    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(square(2));
    }

//  double 타입 square 메서드
//  파라미터 : double x
//  x * x * x를 반환함
    public static double square(double x) {
        return x * x * x;
    }
}
