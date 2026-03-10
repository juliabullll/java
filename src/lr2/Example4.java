package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива (n x n): ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        int value = 1; // начальное значение для заполнения

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Четные строки (0, 2, 4...) - заполняем слева направо
                for (int j = 0; j < n; j++) {
                    array[i][j] = value++;
                }
            } else {
                // Нечетные строки (1, 3, 5...) - заполняем справа налево
                for (int j = n - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }

        System.out.println("\nЗаполненный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
