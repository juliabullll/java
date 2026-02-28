package lr1;
import java.util.Scanner;
import java.util.Calendar;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        System.out.print("Введите год вашего рождения: ");
        int birthYear = in.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Ваш возраст: " + age + " лет");

        in.close();
    }
}
