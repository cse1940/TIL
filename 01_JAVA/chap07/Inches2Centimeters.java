package chap07;

import java.util.Scanner;

public class Inches2Centimeters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inch = s.nextInt();
        double inchToCm = 2.54;
        double cm = inch * inchToCm;

        System.out.println(cm + "cm");
    }
}
