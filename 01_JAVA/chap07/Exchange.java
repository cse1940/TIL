package chap07;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int euro = s.nextInt();
        int dollar = s.nextInt();

        double euroToKwnRate = 1281.62664;
        double dollarToKwnRate = 1091.70306;

        double kwn = euro*euroToKwnRate + dollar*dollarToKwnRate;
        
        System.out.printf("환전결과: %.0f원", kwn);
    }
}
