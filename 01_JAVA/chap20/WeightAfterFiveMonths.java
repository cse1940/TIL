package chap20;

public class WeightAfterFiveMonths {
    public static void main(String[] args) {
//      입력값 받기
        double start = Double.parseDouble("72.4");
        int after = Integer.parseInt("5");

//      계산
        double result = weight(start, after);

        System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
    }

    public static double weight(double currentWeigth, int months) {
        double expectedWeight = currentWeigth;
        for(int i=0; i<months; i++) {
            expectedWeight += 0.231;
        }
        return expectedWeight;
    }
}
