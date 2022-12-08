package chap01;

public class LeapYear {
    public static void main(String[] args) {
        int input = Integer.parseInt("1988");
        boolean output = isLeapYear(input);

        System.out.printf("%d년은 윤년입니까? %s", input, output);
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;

        if(year % 4 == 0 && year % 100 != 0 || year % 1000 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
