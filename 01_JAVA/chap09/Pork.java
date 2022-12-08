package chap09;

public class Pork {
    public static void main(String[] args) {
        calc(3);
    }

//  n인분에 대한 삼겹살 칼로리 계산하는 함수
    public static void calc(int n) {
        int pork = 180;
        double porkKcal = 5.179;

        double sum = pork * n * porkKcal;

        System.out.printf("삼겹살 %d인분: %.2f kcal", n, sum);
    }
}
