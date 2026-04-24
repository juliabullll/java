package timus;
import java.util.Scanner;
public class task_1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code1 = scanner.nextLine();
        String code2 = scanner.nextLine();


        int lastDigit1 = code1.charAt(3) - '0';
        int lastDigit2 = code2.charAt(3) - '0';

        if (lastDigit1 % 2 == 0 || lastDigit2 % 2 == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
