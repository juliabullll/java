package timus;
import java.util.Scanner;
public class task_1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        int sum = a + b;

        System.out.println(sum);

        in.close();
    }
}
