package lr2;
import java.util.Arrays;      // пакет для подключения класса Arrays
import java.util.Random;      // пакет для подключения класса Random
import java.util.Scanner;     // пакет для подключения класса Scanner

public class Example1 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для считывания числа введённого в консоль
        Scanner id = new Scanner(System.in);

        // Сообщение пользователю "Для красоты и понимания"
        System.out.println("Введите размер массива");

        // Запись в переменную size (нужная для того чтобы задать размер массива)
        int size = id.nextInt(); // значения введенного в консоль

        System.out.println("Размер массива равен " + size);

        // Создание массива с размером введённым из консоли
        int[] nums = new int[size];

        // Создание объекта класса Random для генерации "случайного" числа
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            // Присвоение i-тому элементу массива случайного значения
            nums[i] = random.nextInt(200); // bound: 200

            // Сообщение пользователю "Для красоты и понимания"
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        // Сортировка массива по возрастанию его элементов
        Arrays.sort(nums);

        // Сообщение пользователю "Для красоты и понимания"
        System.out.println("Произведена сортировка массива");

        for (int i = 0; i < nums.length; i++) {
            // Сообщение пользователю "Для красоты и понимания"
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums[i]);
        }

        id.close(); // Закрываем Scanner
    }
}