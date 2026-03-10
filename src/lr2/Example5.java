package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        boolean validAnswer = false;
        while (!validAnswer) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                String decryptedText = decrypt(encryptedText, key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                validAnswer = true;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                validAnswer = true;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }

        scanner.close();
    }

    public static String encrypt(String text, int key) {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + key);
        }

        return new String(chars);
    }

    public static String decrypt(String text, int key) {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - key);
        }

        return new String(chars);
    }
}
