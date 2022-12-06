package chap07;

import java.util.Scanner;

public class Alba {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bassPay = s.nextInt();
        int workingHours = s.nextInt();

        int pay = bassPay * workingHours;

        System.out.println("이번달 월급은 " + pay + "원 입니다.");
    }
}
