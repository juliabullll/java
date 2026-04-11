package lr4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example17_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        byte[] array = null;
        int size = 0;

        while (!validInput) {
            try {
                System.out.print("Введите размер массива: ");
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("Размер должен быть положительным.");
                    continue;
                }
                array = new byte[size];
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: ввод строки вместо числа. Повторите ввод.");
                scanner.next();
            }
        }

        for (int i = 0; i < size; i++) {
            boolean elementValid = false;
            while (!elementValid) {
                try {
                    System.out.print("Элемент[" + i + "] (byte от -128 до 127): ");
                    byte value = scanner.nextByte(); // автоматически проверяет диапазон
                    array[i] = value;
                    elementValid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: ввод строки или числа вне диапазона byte. Повторите ввод.");
                    scanner.next();
                }
            }
        }

        // Вычисление суммы с проверкой переполнения диапазона byte
        int sum = 0;
        try {
            for (byte b : array) {
                sum += b;
            }
            if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                throw new ArithmeticException("Сумма вышла за пределы диапазона byte (" + sum + ")");
            }
            System.out.println("Сумма элементов (как byte): " + (byte) sum);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Сумма в типе int: " + sum);
            scanner.close();
            System.out.println("Программа завершена.");
        }
    }
}
