package timus;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class task_1313 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] a = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        // обход по диагоналям (сумма индексов строки и столбца)
        // индексы в матрице: строки 1..N, столбцы 1..N, сумма от 2 до 2N
        for (int s = 2; s <= 2 * N; s++) {
            // внутри диагонали идём от большего номера строки к меньшему
            int iStart = Math.min(N, s - 1);
            int iEnd = Math.max(1, s - N);
            for (int i = iStart; i >= iEnd; i--) {
                int j = s - i; // j от 1 до N
                sb.append(a[i - 1][j - 1]).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
