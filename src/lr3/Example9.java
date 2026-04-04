package lr3;
import java.util.HashMap;
import java.util.Map;

public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");

        System.out.println("Строки с ключом > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.println();

        if (map.containsKey(0)) {
            System.out.print("Строки через запятую: ");
            StringBuilder sb = new StringBuilder();
            for (String value : map.values()) {
                sb.append(value).append(", ");
            }
            System.out.println(sb.substring(0, sb.length() - 2));
        }

        System.out.println();

        int product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
            }
        }
        System.out.println("Результат перемножения ключей: " + product);
    }
}
