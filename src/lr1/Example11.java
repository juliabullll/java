package lr1;

import java.util.Scanner;
import java.util.Calendar;

public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите год вашего рождения: ");
        int birthYear = in.nextInt();

        int age = currentYear - birthYear;


        System.out.println(name + " " + age);

        in.close();
    }
}
