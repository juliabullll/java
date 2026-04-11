package lr4;
import java.util.Scanner;
public class Example16_2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер столбца (0-3): ");
        int column = scanner.nextInt();

        System.out.println("Столбец " + column + ":");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][column]);
        }

        scanner.close();
    }
}
