package lr3;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        inputArray(array, 0, in);

        System.out.println("Введенный массив:");
        outputArray(array, 0);

        in.close();
    }

    public static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index < arr.length) {
            System.out.print("arr[" + index + "] = ");
            arr[index] = scanner.nextInt();
            inputArray(arr, index + 1, scanner);
        }
    }

    public static void outputArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println("arr[" + index + "] = " + arr[index]);
            outputArray(arr, index + 1);
        }
    }
}