package timus;
import java.util.Scanner;
public class task_1226 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(decryptLine(line));
        }

        in.close();
    }

    private static String decryptLine(String line) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            // Проверяем, является ли символ латинской буквой
            if (isLatinLetter(c)) {
                word.append(c); // добавляем букву к текущему слову
            } else {
                // Если накопили слово - переворачиваем его и добавляем
                if (word.length() > 0) {
                    result.append(word.reverse());
                    word.setLength(0); // очищаем
                }
                // Добавляем не-буквенный символ
                result.append(c);
            }
        }

        // Не забываем про последнее слово, если оно есть
        if (word.length() > 0) {
            result.append(word.reverse());
        }

        return result.toString();
    }

    private static boolean isLatinLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
