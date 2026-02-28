package lr1;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the name of the week: ");
        String dayOfWeek = in.nextLine();

        System.out.print("Input the name of the month: ");
        String month = in.nextLine();

        System.out.print("Input the day number in the month: ");
        int dayOfMonth = in.nextInt();

        System.out.println("Today: " + dayOfWeek + ", " + dayOfMonth + " " + month);

        in.close();
    }
}
