package lr3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example10_3 {
    public static void main(String[] args) {
        int N = 100000;

        long startTime = System.nanoTime();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            arrayList.add(i);
        }
        int index = 0;
        while (arrayList.size() > 1) {
            index = (index + 1) % arrayList.size();
            arrayList.remove(index);
        }

        long endTime = System.nanoTime();
        System.out.println("ArrayList время: " + (endTime - startTime) / 1000000 + " мс");

        startTime = System.nanoTime();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            linkedList.add(i);
        }
        index = 0;
        while (linkedList.size() > 1) {
            index = (index + 1) % linkedList.size();
            linkedList.remove(index);
        }

        endTime = System.nanoTime();
        System.out.println("LinkedList время: " + (endTime - startTime) / 1000000 + " мс");
    }
}
