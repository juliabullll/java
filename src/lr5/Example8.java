package lr5;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class Example8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 7, 10, 3);

        System.out.println("Исходные числа: " + numbers);
        List<Integer> squares = squareList(numbers);
        System.out.println("Квадраты: " + squares);
    }

    public static List<Integer> squareList(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }

}
