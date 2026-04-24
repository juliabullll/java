package lr5;
import java.util.List;
import java.util.stream.Collectors;

public class Example14 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 8, 20, 3, 15, 7);
        int threshold = 10;

        System.out.println("Исходные числа: " + numbers);
        System.out.println("Порог: " + threshold);
        List<Integer> less = filterLessThan(numbers, threshold);
        System.out.println("Числа меньше " + threshold + ": " + less);
    }

    public static List<Integer> filterLessThan(List<Integer> list, int threshold) {
        return list.stream()
                .filter(x -> x < threshold)
                .collect(Collectors.toList());
    }
}

