package lr6;
import java.util.Random;

public class Example6 {
    static class SumFinder extends Thread {
        private final int[] arr;
        private final int start;
        private final int end;
        private int localSum;

        public SumFinder(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
            this.localSum = 0;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                localSum += arr[i];
            }
        }

        public int getLocalSum() {
            return localSum;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int threadCount = Runtime.getRuntime().availableProcessors();
        int[] array = new int[100000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        int sequentialSum = findSumSequential(array);
        System.out.println("Однопоточная сумма: " + sequentialSum);

        int parallelSum = findSumParallel(array, threadCount);
        System.out.println("Многопоточная сумма: " + parallelSum);
        System.out.println("Результаты совпадают: " + (sequentialSum == parallelSum));
    }

    private static int findSumSequential(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    private static int findSumParallel(int[] arr, int threadCount) throws InterruptedException {
        SumFinder[] threads = new SumFinder[threadCount];
        int chunkSize = arr.length / threadCount;
        int remainder = arr.length % threadCount;
        int currentStart = 0;

        for (int i = 0; i < threadCount; i++) {
            int chunk = chunkSize + (i < remainder ? 1 : 0);
            threads[i] = new SumFinder(arr, currentStart, currentStart + chunk);
            threads[i].start();
            currentStart += chunk;
        }

        for (SumFinder thread : threads) {
            thread.join();
        }

        int globalSum = 0;
        for (SumFinder thread : threads) {
            globalSum += thread.getLocalSum();
        }

        return globalSum;
    }
}
