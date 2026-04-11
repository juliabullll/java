package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example16_1 {
    public static void main(String[] args) {
        // Задаём матрицу для примера
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        Scanner scanner = new Scanner(System.in);
        int columnNumber = -1;
        boolean validInput = false;

        // Ввод номера столбца с обработкой ошибок
        while (!validInput) {
            try {
                System.out.print("Введите номер столбца (от 0 до " + (matrix[0].length - 1) + "): ");
                columnNumber = scanner.nextInt();
                // Проверка существования столбца
                if (columnNumber < 0 || columnNumber >= matrix[0].length) {
                    throw new ArrayIndexOutOfBoundsException("Столбца с номером " + columnNumber + " не существует.");
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ввод строки вместо числа. Повторите ввод.");
                scanner.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        // Вывод столбца
        System.out.println("Столбец " + columnNumber + ":");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][columnNumber]);
        }

        scanner.close();
        System.out.println("Программа завершена.");
    }
}
