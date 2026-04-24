package lr5;
import java.util.List;
import java.util.stream.Collectors;

public class Example13 {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "world123", "Java", "2024", "StreamAPI", "pure8758495");

        System.out.println("Исходный список: " + strings);
        List<String> onlyLetters = filterOnlyLetters(strings);
        System.out.println("Только буквы: " + onlyLetters);
    }

    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
