package timus;
import java.util.Scanner;
public class task_2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();

        if (45 * (12 - f) <= 240) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
