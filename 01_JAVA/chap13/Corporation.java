package chap13;

public class Corporation {
    public static void test(int time, int limitHours) {
        if(time <= 18 || limitHours <= 8) {
            System.out.println("Good!");
        } else {
            System.out.println("Bad!!");
        }
    }

    public static void main(String[] args) {
        int time = Integer.parseInt("18");
        int hours = Integer.parseInt("7");

        test(time, hours);
    }
}
