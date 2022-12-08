package chap01;

public class Tabacco {
    public static void main(String[] args) {
        buy(15);
        buy(19);
        buy(22);
    }

    public static void buy(int age) {
        String result = "";

        if(age >= 19) {
            result = "O";
        } else {
            result = "X";
        }
        System.out.printf("%d세 => 담배판매(%s)\n", age, result);
    }
}
