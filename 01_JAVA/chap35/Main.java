package chap35;

public class Main {
    public static void main(String[] args) {
//      객체 생성
        KRW krw = new KRW(1500, "원");
        USD usd = new USD(100.50, "달러");
        EUR eur = new EUR(260.87, "유로");
        JPY jpy = new JPY(1400, "엔");

//  부모 클래스를 통한 그룹화
    Currency[] currencies = {krw, usd, eur, jpy};

//  모든 화폐정보를 출력
    for(Currency c : currencies) {
        System.out.println(c.toString());
    }
  }
}

// 1. 부모 클래스 작성
class Currency {
//  1.1 중복 필드를 작성
    private double amount; // 수량
    private String notation; // 표기법(원)
//  1.2 생성자를 작성
    public Currency(double amount, String notation) {
        this.amount = amount;
        this.notation = notation;
    } 
//  3. toString() 메서드 오버라이딩
    public String toString() {
        return String.format("%s: %.2f %s", this.getClass().getSimpleName(), amount);
    }
}

// 2. 자식클래스가 부모클래스를 상속받음
class KRW extends Currency {
    public KRW(double amount, String notation) {
        super(amount, notation);
    }
}

class USD extends Currency {
    public USD(double amount, String notation) {
        super(amount, notation);
    }
}

class EUR extends Currency {
    public EUR(double amount, String notation) {
        super(amount, notation);
    }
}

class JPY extends Currency {
    public JPY(double amount, String notation) {
        super(amount, notation);
    }
}


