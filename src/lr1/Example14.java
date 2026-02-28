package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        int lessByOne = num - 1;
        int moreByOne = num + 1;

        int sum = lessByOne + num + moreByOne;

        int squareOfSum = sum * sum;

        System.out.println(lessByOne + ", " + num + ", " + moreByOne + ", " + squareOfSum);

        in.close();
    }
}
