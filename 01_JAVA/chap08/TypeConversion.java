package chap08;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("a = " + a);

        double b = 2 / 3; // int => double(자동)
        System.out.println("b = " + b);

//      강제 형변환
        int c = (int)1.5;
        System.out.println("c = " + c);

        double d = 2 / 3; // int => double(자동)
        System.out.println("d = " + d);

        double e = (double)2 / 3;
        System.out.println("e = " + e);
    }
}
