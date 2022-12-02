package chap14;

public class JavaCorporation {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }

    public static void printPay(double basePay, int hours) {
//      최저시급
        if(basePay < 8.00) {
            System.out.println("ERROR: 최저시급 불이행");
            return; // return 키워드를 만나면 해당 메서드가 종료됨
        } else if(hours > 60) {
            System.out.println("ERROR: 초과근무시간을 넘었습니다.");
            return;
        }

  

        double pay = 0;

        if(hours > 40) {
            int extraHours = hours - 40; // 초과 근무 시간
            hours -= extraHours; // 초과 근무 시간 제거
            double extraPay = basePay * extraHours * 1.5; // 초과 급여
            pay += extraPay;
        }

        pay += basePay * hours;
        System.out.printf("$ %.2f\n", pay);
    }
}
