package lr2;
import java.util.Random;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Находим минимум
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.print("Индексы минимальных элементов: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
