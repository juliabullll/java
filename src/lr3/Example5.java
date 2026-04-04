package lr3;

public class Example5 {
    private static int callCounter = 0;

    public static void main(String[] args) {
        int n = 5; // Номер числа Фибоначчи для вычисления

        System.out.println("Вычисление числа Фибоначчи для n = " + n);

        // Сбрасываем счетчик перед началом
        callCounter = 0;

        // Вычисляем число Фибоначчи
        int result = fibonacci(n);

        System.out.println("Результат: F(" + n + ") = " + result);
        System.out.println("Всего рекурсивных вызовов: " + callCounter);
    }

    public static int fibonacci(int n) {
        // Увеличиваем счетчик при каждом вызове
        callCounter++;

        // Выводим информацию о текущем вызове
        printCallInfo(n);

        // Базовые случаи
        if (n == 0) {
            System.out.println("  → Возвращаем 0 (базовый случай)");
            return 0;
        } else if (n == 1) {
            System.out.println("  → Возвращаем 1 (базовый случай)");
            return 1;
        } else {
            // Рекурсивный случай
            System.out.println("  → Вычисляем F(" + n + ") = F(" + (n-2) + ") + F(" + (n-1) + ")");

            // Рекурсивные вызовы
            int left = fibonacci(n - 2);  // F(n-2)
            int right = fibonacci(n - 1); // F(n-1)

            int result = left + right;
            System.out.println("  → F(" + n + ") = " + left + " + " + right + " = " + result);

            return result;
        }
    }

    private static void printCallInfo(int n) {
        // Создаем отступ для визуализации глубины рекурсии
        String indent = "  ".repeat(getDepth(n));

        System.out.println(indent + "Вызов #" + callCounter + ": F(" + n + ")");
    }

    private static int getDepth(int n) {
        if (n <= 1) return 0;
        return 1 + Math.max(getDepth(n-1), getDepth(n-2));
    }
}

