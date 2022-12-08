package chap01.Array;

public class OutOfIndex {
    public static void main(String[] args) {
        String[] names = {"Kim", "Lee", "Park", "Choi"};

        for(int i=0; i<5; i++) {
            System.out.printf("names[%d] => %s\n", i, names[i]);
        }
    }
}
