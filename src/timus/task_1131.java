package timus;

import java.util.Scanner;

public class task_1131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long K = scanner.nextLong();
        scanner.close();

        long time = 0;
        long computers = 1;

        while (computers < K && computers < N) {
            computers *= 2;
            time++;
        }

        if (computers >= N) {
            System.out.println(time);
            return;
        }

        long remaining = N - computers;
        time += (remaining + K - 1) / K;

        System.out.println(time);
    }
}