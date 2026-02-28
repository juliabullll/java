package timus;
import java.util.Scanner;
public class task_1327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int A = in.nextInt();
        System.out.print("Введите второе число: ");
        int B = in.nextInt();

        int result = (B + 1) / 2 - A / 2;

        System.out.println(result);
        in.close();
    }
}
