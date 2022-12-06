package chap07;

public class AverageWeigth {
    public static void main(String[] args) {
        double weight1 = 81.36;
        double weight2 = weight1 + 0.71;
        double weight3 = weight2 - 0.43;

        double average = (weight1 + weight2 + weight3) / 3;

        System.out.printf("%.2fkg", average);
    }
}
