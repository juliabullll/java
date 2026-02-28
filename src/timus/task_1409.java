package timus;
import java.util.Scanner;
public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сколько прострелил Гарри: ");
        int h = in.nextInt();
        System.out.print("Введите сколько прострелил Ларри: ");
        int l = in.nextInt();

        int notHarry = l - 1;
        int notLarry = h - 1;

        System.out.println(notHarry + " " + notLarry);
        in.close();
    }
}
