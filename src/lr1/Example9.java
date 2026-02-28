package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the name of the month: ");
        String month = in.nextLine();

        System.out.print("Input the number of days in the month " + month + ": ");
        int days = in.nextInt();

        System.out.println("Месяц " + month + " содержит " + days + " дней.");

        in.close();
    }

}
