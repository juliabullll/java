package lr3;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ПЕРЕВОД ЧИСЛА В ДВОИЧНУЮ СИСТЕМУ СЧИСЛЕНИЯ");

        // Ввод числа
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        // Проверка на отрицательные числа
        if (number < 0) {
            System.out.println("Для отрицательных чисел используется дополнительный код");
            System.out.println("Будет выведен двоичный код для модуля числа со знаком '-'");
        }

        System.out.println("Результат перевода:");
        System.out.print("Число " + number + " в двоичной системе = ");

        // Вызов рекурсивного метода
        printBinary(number);

        System.out.println(); // Переход на новую строку
        scanner.close();
    }

    public static void printBinary(int n) {
        // Базовый случай: если число меньше 2, выводим его как есть
        if (n < 2) {
            System.out.print(Math.abs(n)); // Выводим модуль числа
            return;
        }

        // Рекурсивный случай: сначала выводим старшие разряды
        printBinary(n / 2);

        // Затем выводим младший разряд (остаток от деления на 2)
        System.out.print(Math.abs(n % 2));
    }


}
