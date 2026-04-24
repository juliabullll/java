package lr5;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 40);
        int divisor = 5;

        System.out.println("Исходные числа: " + numbers);
        System.out.println("Делитель: " + divisor);
        List<Integer> divisible = filterDivisible(numbers, divisor);
        System.out.println("Делятся на " + divisor + ": " + divisible);
    }

    public static List<Integer> filterDivisible(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}
