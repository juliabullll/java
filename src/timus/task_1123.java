package timus;
import java.util.Scanner;
public class task_1123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();

        char[] num = s.toCharArray();
        int n = num.length;

        char[] palindrome = makePalindrome(num);

        if (compare(palindrome, num) >= 0) {
            System.out.println(new String(palindrome));
            return;
        }

        increaseMiddle(num);

        System.out.println(new String(makePalindrome(num)));

        in.close();
    }


    private static char[] makePalindrome(char[] num) {
        int n = num.length;
        char[] result = num.clone();

        for (int i = 0; i < n / 2; i++) {
            result[n - 1 - i] = result[i];
        }

        return result;
    }

    private static int compare(char[] a, char[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return a[i] - b[i];
            }
        }
        return 0;
    }

    private static void increaseMiddle(char[] num) {
        int n = num.length;
        int mid = (n - 1) / 2;

        int i = mid;
        while (i >= 0 && num[i] == '9') {
            num[i] = '0';
            i--;
        }

        if (i >= 0) {
            num[i]++;
        } else {
            // Все цифры были 9 (например, 999 -> 1001)
            char[] newNum = new char[n + 1];
            newNum[0] = '1';
            for (int j = 1; j < n; j++) {
                newNum[j] = '0';
            }
            newNum[n] = '1';
            num = newNum;
        }
    }
}
