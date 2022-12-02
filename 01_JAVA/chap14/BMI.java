package chap14;

public class BMI {
    public static void main(String[] args) {
        double weight = Double.parseDouble("64");
        double height = Double.parseDouble("1.6");
//      BMI 지수 계산
        double bmi = calculateBMI(weight, height);
        printBMIClassification(bmi);
    }

//  bmi 계산
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

//  비만도를 출력
    public static void printBMIClassification(double bmi) {
        System.out.printf("BMI: %.2f\n", bmi);
        
        if(bmi > 30) {
            System.out.println("비만 입니다.");
        } else if(bmi > 25) {
            System.out.println("과체중 입니다.");
        } else if(bmi >= 18.5) {
            System.out.println("정상 입니다.");
        } else {
            System.out.println("저체중 입니다.");
        }
    }
}
