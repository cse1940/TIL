package chap01;

import java.util.Scanner;

public class KimBob {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String menu1 = s.nextLine();
        String menu2 = s.nextLine();

        System.out.println(menu1 + "김밥~");
        System.out.println(menu2 + "김밥~");
    }
}
