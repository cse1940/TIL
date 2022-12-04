package chap20;

public class TopScoreStudent {
    public static int topIndex(int[] scores) {
//      가장 높은 성적의 인덱스를 반환하는 함수
        int topIdx = 0;
        for(int i=0; i<scores.length; i++) {
            if(scores[topIdx] < scores[i]) { // 더 큰 수가 나타났다면,
                topIdx = i; // 새롭게 가장 큰 수의 위치를 설정 한다.
            }
        }
        return topIdx;
    }

    public static void main(String[] args) {
        String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alice", "Adam", "Mary"};
        int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};
//      1등 검색
        int i = topIndex(scores);
        System.out.printf("1등: %s(%d)\n", names[i], scores[i]);
    }
}
