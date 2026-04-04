package lr3;

import java.util.*;

public class CompareCollections {

    private static final int N = 2_000_000;
    private static final int TEST_SIZE = 100_000;

    public static void main(String[] args) {

        System.out.println("Сравнение коллекций");
        System.out.println("Количество элементов: " + N);
        System.out.println();


        long alEnd = 0;
        ArrayList<Integer> al = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) al.add(i);
        alEnd = System.currentTimeMillis() - start;

        long alStart = 0;
        ArrayList<Integer> al2 = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) al2.add(0, i);
        alStart = System.currentTimeMillis() - start;

        long alMiddle = 0;
        ArrayList<Integer> al3 = new ArrayList<>();
        for (int i = 0; i < TEST_SIZE; i++) al3.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) al3.add(TEST_SIZE / 2, i);
        alMiddle = System.currentTimeMillis() - start;

        long llEnd = 0;
        LinkedList<Integer> ll = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) ll.add(i);
        llEnd = System.currentTimeMillis() - start;

        long llStart = 0;
        LinkedList<Integer> ll2 = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) ll2.addFirst(i);
        llStart = System.currentTimeMillis() - start;

        long llMiddle = 0;
        LinkedList<Integer> ll3 = new LinkedList<>();
        for (int i = 0; i < TEST_SIZE; i++) ll3.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) ll3.add(TEST_SIZE / 2, i);
        llMiddle = System.currentTimeMillis() - start;

        long tsEnd = 0;
        TreeSet<Integer> ts = new TreeSet<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) ts.add(i);
        tsEnd = System.currentTimeMillis() - start;

        System.out.println("Таблица 1. Добавление элементов (мс)");
        System.out.println("Коллекция\t\tв начало\tв середину\tв конец");
        System.out.println("ArrayList\t\t" + alStart + "\t\t" + alMiddle + "\t\t" + alEnd);
        System.out.println("LinkedList\t\t" + llStart + "\t\t" + llMiddle + "\t\t" + llEnd);
        System.out.println("SortedSet(TreeSet)\t-\t\t-\t\t" + tsEnd);
        System.out.println();

        long alRemoveStart = 0;
        ArrayList<Integer> alr = new ArrayList<>();
        for (int i = 0; i < TEST_SIZE; i++) alr.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) alr.remove(0);
        alRemoveStart = System.currentTimeMillis() - start;

        long alRemoveMiddle = 0;
        ArrayList<Integer> alr2 = new ArrayList<>();
        for (int i = 0; i < TEST_SIZE; i++) alr2.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) {
            if (alr2.size() > 0) {
                alr2.remove(alr2.size() / 2);
            }
        }
        alRemoveMiddle = System.currentTimeMillis() - start;

        long alRemoveEnd = 0;
        ArrayList<Integer> alr3 = new ArrayList<>();
        for (int i = 0; i < TEST_SIZE; i++) alr3.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) alr3.remove(alr3.size() - 1);
        alRemoveEnd = System.currentTimeMillis() - start;

        long llRemoveStart = 0;
        LinkedList<Integer> llr = new LinkedList<>();
        for (int i = 0; i < TEST_SIZE; i++) llr.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) llr.removeFirst();
        llRemoveStart = System.currentTimeMillis() - start;

        long llRemoveMiddle = 0;
        LinkedList<Integer> llr2 = new LinkedList<>();
        for (int i = 0; i < TEST_SIZE; i++) llr2.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE / 10; i++) {
            if (llr2.size() > 0) {
                llr2.remove(llr2.size() / 2);
            }
        }
        llRemoveMiddle = System.currentTimeMillis() - start;

        long llRemoveEnd = 0;
        LinkedList<Integer> llr3 = new LinkedList<>();
        for (int i = 0; i < TEST_SIZE; i++) llr3.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) llr3.removeLast();
        llRemoveEnd = System.currentTimeMillis() - start;

        long tsRemoveStart = 0;
        TreeSet<Integer> tsr = new TreeSet<>();
        for (int i = 0; i < TEST_SIZE; i++) tsr.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) {
            if (!tsr.isEmpty()) {
                tsr.remove(tsr.first());
            }
        }
        tsRemoveStart = System.currentTimeMillis() - start;

        long tsRemoveMiddle = 0;
        TreeSet<Integer> tsr2 = new TreeSet<>();
        for (int i = 0; i < TEST_SIZE; i++) tsr2.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE / 2; i++) {
            tsr2.remove(i);
        }
        tsRemoveMiddle = System.currentTimeMillis() - start;

        long tsRemoveEnd = 0;
        TreeSet<Integer> tsr3 = new TreeSet<>();
        for (int i = 0; i < TEST_SIZE; i++) tsr3.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < TEST_SIZE; i++) {
            if (!tsr3.isEmpty()) {
                tsr3.remove(tsr3.last());
            }
        }
        tsRemoveEnd = System.currentTimeMillis() - start;

        System.out.println("Таблица 2. Удаление элементов (мс)");
        System.out.println("Коллекция\t\tв начало\tв середину\tв конец");
        System.out.println("ArrayList\t\t" + alRemoveStart + "\t\t" + alRemoveMiddle + "\t\t" + alRemoveEnd);
        System.out.println("LinkedList\t\t" + llRemoveStart + "\t\t" + llRemoveMiddle + "\t\t" + llRemoveEnd);
        System.out.println("SortedSet(TreeSet)\t" + tsRemoveStart + "\t\t" + tsRemoveMiddle + "\t\t" + tsRemoveEnd);
        System.out.println();


        int index = 1_000_000_000 % N;

        long alGet = 0;
        ArrayList<Integer> alg = new ArrayList<>();
        for (int i = 0; i < N; i++) alg.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) alg.get(index);
        alGet = System.currentTimeMillis() - start;

        long llGet = 0;
        LinkedList<Integer> llg = new LinkedList<>();
        for (int i = 0; i < N; i++) llg.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) llg.get(index);
        llGet = System.currentTimeMillis() - start;

        long tsGet = 0;
        TreeSet<Integer> tsg = new TreeSet<>();
        for (int i = 0; i < N; i++) tsg.add(i);
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) tsg.contains(index);
        tsGet = System.currentTimeMillis() - start;

        System.out.println("Таблица 3. Получение элемента (мс)");
        System.out.println("Коллекция\t\tпо индексу " + index);
        System.out.println("ArrayList\t\t" + alGet);
        System.out.println("LinkedList\t\t" + llGet);
        System.out.println("SortedSet(TreeSet)\t" + tsGet + " (поиск по значению)");
    }
}