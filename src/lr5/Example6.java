package lr5;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массивов: ");
        int size = in.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(20);
            arr2[i] = random.nextInt(20);
        }

        System.out.println("Первый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2));

        int[] common = findCommonElements(arr1, arr2);
        System.out.println("Общие элементы: " + Arrays.toString(common));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x))
                .distinct()   // чтобы избежать повторений
                .toArray();
    }
}
