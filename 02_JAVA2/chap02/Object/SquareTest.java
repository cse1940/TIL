package Object;

public class SquareTest {
    public static void main(String[] args) {
        Square s = new Square();

        s.length = 4;
        s.area();
    }
}

class Square {
    int length;

    void area() {
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", length, length*length);
    }
}
