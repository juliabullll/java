package lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example15_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int[] array = null;
        int size = 0;

        // Ввод размера массива с обработкой ошибок
        while (!validInput) {
            try {
                System.out.print("Введите размер массива: ");
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Размер должен быть положительным. Повторите ввод.");
                    continue;
                }
                array = new int[size];
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ввод строки вместо числа. Повторите ввод.");
                scanner.next();
            }
        }

        // Ввод элементов массива
        int positiveCount = 0;
        int positiveSum = 0;
        for (int i = 0; i < size; i++) {
            boolean elementValid = false;
            while (!elementValid) {
                try {
                    System.out.print("Элемент[" + i + "] = ");
                    int value = scanner.nextInt();
                    array[i] = value;
                    if (value > 0) {
                        positiveSum += value;
                        positiveCount++;
                    }
                    elementValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: ввод строки вместо числа. Повторите ввод элемента.");
                    scanner.next();
                }
            }
        }

        // Вычисление среднего
        try {
            if (positiveCount == 0) {
                throw new ArithmeticException("Положительные элементы отсутствуют.");
            }
            double average = (double) positiveSum / positiveCount;
            System.out.printf("Среднее среди положительных элементов: %.2f\n", average);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Программа завершена.");
        }
    }
}
