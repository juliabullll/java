package lr1;

import java.util.Scanner;
import java.util.Calendar;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        int birthYear = currentYear - age;

        System.out.println("Год вашего рождения: " + birthYear);

        in.close();
    }
}
