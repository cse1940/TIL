package chap34;

public class Main {
    public static void main(String[] args) {
//      서로 다른 객체 생성
        Juice j = new Juice();
        Coffee c = new Coffee();
        Beer b = new Beer();
        Water w = new Water();
        Tea t = new Tea();

//      추상클래스를 통한 그룹화
        Drink[] drinks = {j, c, b, w, t};
//      그룹화된 객체들의 주문 결과 출력
        for(Drink d : drinks) {
            d.ordered();
        }
    }
}

// (1) 추상 클래스 Drink를 선언
abstract class Drink {
    String name;
    double price;
    public void ordered() {
        System.out.println("주문되었습니다.");
    }
}
// (2) 상속을 통해 중복코드를 줄임
class Juice extends Drink {
    
}

class Coffee extends Drink {

}

class Beer extends Drink {

}

class Water extends Drink {

}

class Tea extends Drink {

}
