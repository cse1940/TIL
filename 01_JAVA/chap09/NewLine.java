package chap09;

class NewLine {
//  메소드 1
    public static void threeLines() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

//  프로그램의 시작점
    public static void main(String[] args) {
        System.out.println("Line 1");
        threeLines();
        System.out.println("Line 2");
    }
}
