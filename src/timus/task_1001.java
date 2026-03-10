package timus;
import java.util.Scanner;
import java.util.ArrayList;
public class task_1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        System.out.println("Введите числа (для окончания введите 'end'):");

        // Читаем числа, пока есть ввод
        while (in.hasNext()) {
            if (in.hasNextLong()) {
                long num = in.nextLong();
                numbers.add(num);
                System.out.println("Прочитано число: " + num);
            } else {
                String stop = in.next();
                if (stop.equals("end")) {
                    break;
                } else {
                    System.out.println("Игнорируем: " + stop);
                }
            }
        }

        System.out.println("\nВсего прочитано чисел: " + numbers.size());
        System.out.println("Результаты:");

        // Выводим квадратные корни в обратном порядке
        for (int i = numbers.size() - 1; i >= 0; i--) {
            long num = numbers.get(i);
            double sqrt = Math.sqrt(num);
            System.out.printf("%.4f%n", sqrt);
        }

        in.close();
    }
}
