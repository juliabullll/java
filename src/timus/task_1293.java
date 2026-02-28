package timus;
import java.util.Scanner;
public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int N = in.nextInt();
        System.out.print("Введите второе число: ");
        int A = in.nextInt();
        System.out.print("Введите третье число: ");
        int B = in.nextInt();

        int result = N * (A * B) * 2;

        System.out.println(result);

        in.close();
    }
}
