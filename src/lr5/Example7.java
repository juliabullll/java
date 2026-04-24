package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "Banana", "cherry", "Date", "strawberry", "Plum");

        System.out.println("Исходный список: " + words);
        List<String> capitalized = filterCapitalizedStrings(words);
        System.out.println("С большой буквы: " + capitalized);
    }

    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
