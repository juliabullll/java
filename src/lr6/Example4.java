package lr6;

public class Example4 {
    public static void main(String[] args) {

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            final int threadNumber = i + 1;

            threads[i] = new Thread(() -> {
                System.out.println("Поток №" + threadNumber + " выполняется");
            });

            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
