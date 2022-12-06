package chap07;

public class F2C {
    public static void main(String[] args) {
        double fahrenheit = Double.parseDouble("77.0");

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println(celsius);
    }
}
