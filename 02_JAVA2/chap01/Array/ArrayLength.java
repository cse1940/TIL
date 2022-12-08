package chap01.Array;

public class ArrayLength {
    public static void main(String[] args) {
        String[] cores = {"자바", "자료구조", "알고리즘", "데이터베이스"};
        String[] electives = {"컴퓨터 네트워크", "운영체제", "소프트웨어 공학"};
        String[] generals = {"영어회화", "영독해", "영작문", "팀워크", "직업윤리"};

        System.out.print("핵심과정: ");
        for(int i=0; i<cores.length; i++) {
            System.out.printf("%s ", cores[i]);
        }

        System.out.print("\n선택과정: ");
        for(int i=0; i<electives.length; i++) {
            System.out.printf("%s ", electives[i]);
        }

        System.out.print("\n교양과정: ");
        for(int i=0; i<generals.length; i++) {
            System.out.printf("%s ", generals[i]);
        }
    }
}
