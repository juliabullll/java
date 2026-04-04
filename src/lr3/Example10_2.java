package lr3;
import java.util.LinkedList;
import java.util.List;
public class Example10_2 {
    public static void main(String[] args) {
        int N = 10;

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }

        System.out.println("Осталось человек: " + list.get(0));
    }

}
