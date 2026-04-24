package lr5;

import java.util.List;
import java.util.stream.Collectors;
public class Example9 {
    public static void main(String[] args) {
        List<String> strings = List.of("hello world", "java programming", "stream api", "world of java");
        String substring = "java";

        System.out.println("Исходный список: " + strings);
        System.out.println("Подстрока для поиска: \"" + substring + "\"");
        List<String> filtered = filterBySubstring(strings, substring);
        System.out.println("Содержащие подстроку: " + filtered);
    }

    public static List<String> filterBySubstring(List<String> list, String sub) {
        return list.stream()
                .filter(s -> s.contains(sub))
                .collect(Collectors.toList());
    }
}
