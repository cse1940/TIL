package chap01;

import java.util.Scanner;

public class ChickenDrinks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String drinks = s.nextLine();

        if(drinks.equals("콜라")) {
            System.out.println("치킨엔 콜라가 제맛이지~");
        }
    }
}