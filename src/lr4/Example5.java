package lr4;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (RuntimeException e) {   // ← исправлено: подходящий тип
            System.out.println("Перехвачено: " + e);
        }
        System.out.println("2");   // теперь выполнится
    }
}
