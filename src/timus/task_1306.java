package timus;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class task_1306 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        double median;
        if (N % 2 == 1) {
            median = arr[N / 2];
        } else {
            long sum = (long) arr[N / 2 - 1] + (long) arr[N / 2];
            median = sum / 2.0;
        }
        System.out.printf("%.1f", median);
    }
}
