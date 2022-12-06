package chap06;

public class Shopping {
    public static void main(String[] args) {
        String item1 = "한우 꽃등심";
        String item2 = "참치 선물팩";
        String item3 = "맥스봉 한팩";
        
        int price1 = 112500;
        int price2 = 22500;
        int price3 = 5000;

        // %s : 문자열을 출력
        // %d : 십진수를 출력
        // %f : 실수를 출력
        System.out.printf("품명: %-8s, 가격: %7d\n", item1, price1);
        System.out.printf("품명: %-8s, 가격: %7d\n", item2, price2);
        System.out.printf("품명: %-8s, 가격: %7d\n", item3, price3);
    }
}
