package chap29;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Evan");
        names.add("Eugene");
        names.add("Adam");

        System.out.printf("names.size(): %d\n", names.size());
        System.out.printf("names.get(0): %s\n", names.get(0));
        System.out.printf("names.get(1): %s\n", names.get(1));

        names.set(0, "Paul");
        names.remove(1);

        for(String name : names) {
            System.out.println(name);
        }
    }
}
