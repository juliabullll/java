package lr6;
import java.util.Arrays;
import java.util.Random;

public class Example5 {
    static class MaxFinder extends Thread {
        private final int[] arr;
        private final int start;
        private final int end;
        private int localMax;

        public MaxFinder(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
            this.localMax = Integer.MIN_VALUE;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                if (arr[i] > localMax) {
                    localMax = arr[i];
                }
            }
        }

        public int getLocalMax() {
            return localMax;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int threadCount = Runtime.getRuntime().availableProcessors();
        int[] array = new int[100000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int sequentialMax = findMaxSequential(array);
        System.out.println("Однопоточный максимум: " + sequentialMax);

        int parallelMax = findMaxParallel(array, threadCount);
        System.out.println("Многопоточный максимум: " + parallelMax);
        System.out.println("Результаты совпадают: " + (sequentialMax == parallelMax));
    }

    private static int findMaxSequential(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int findMaxParallel(int[] arr, int threadCount) throws InterruptedException {
        MaxFinder[] threads = new MaxFinder[threadCount];
        int chunkSize = arr.length / threadCount;
        int remainder = arr.length % threadCount;
        int currentStart = 0;

        for (int i = 0; i < threadCount; i++) {
            int chunk = chunkSize + (i < remainder ? 1 : 0);
            threads[i] = new MaxFinder(arr, currentStart, currentStart + chunk);
            threads[i].start();
            currentStart += chunk;
        }

        for (MaxFinder thread : threads) {
            thread.join();
        }

        int globalMax = Integer.MIN_VALUE;
        for (MaxFinder thread : threads) {
            if (thread.getLocalMax() > globalMax) {
                globalMax = thread.getLocalMax();
            }
        }

        return globalMax;
    }
}
