package lr5;
import java.util.List;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "elephant", "dog", "hamster", "fox");
        int minLength = 4;

        System.out.println("Исходный список: " + words);
        System.out.println("Минимальная длина: " + minLength);
        List<String> longWords = filterByLength(words, minLength);
        System.out.println("Строки длиннее " + minLength + ": " + longWords);
    }

    public static List<String> filterByLength(List<String> list, int minLen) {
        return list.stream()
                .filter(s -> s.length() > minLen)
                .collect(Collectors.toList());
    }

}
