package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();

        double sum = num1 + num2;
        double difference = num2 - num1;

        System.out.println("Сумма чисел " + " = " + sum);
        System.out.println("Разность чисел " + " = " + difference);
        in.close();
    }
}
