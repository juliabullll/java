package lr4;
import java.util.Scanner;
public class Example17_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        byte[] array = new byte[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Элемент[" + i + "] (byte): ");
            byte value = scanner.nextByte();
            array[i] = value;
            sum += value;
        }

        System.out.println("Сумма (int): " + sum);
        System.out.println("Сумма (byte): " + (byte) sum);
        scanner.close();
    }
}
