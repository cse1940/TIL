package Api;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Kim");
        names.add("Park");
        names.add("Choi");
        names.add("Lee");
        names.add("Hong");
        names.add("No");

        for(int i=0; i<names.size(); i++) {
            System.out.printf("names.get(%d) => %s\n", i, names.get(i));
        }
        
    }
}