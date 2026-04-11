package lr4;
import java.util.Scanner;
public class Example15_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int positiveSum = 0;
        int positiveCount = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Элемент[" + i + "] = ");
            int value = scanner.nextInt();
            array[i] = value;
            if (value > 0) {
                positiveSum += value;
                positiveCount++;
            }
        }

        double average = (double) positiveSum / positiveCount;
        System.out.printf("Среднее среди положительных: %.2f\n", average);

        scanner.close();
    }
}
