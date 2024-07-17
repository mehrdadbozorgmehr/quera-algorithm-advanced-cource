package quera.algorithm.season1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * improve memory fir Example allocation in foreach with non binary-search
 */
public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int M = Arrays.stream(a)
                .max()
                .orElseThrow();

        int[] cnt = new int[M + 1];

        for (int i = 0; i < n; i++) {
            cnt[a[i]]++;
        }

        int[] ps = new int[M];
        for (int i = 1; i < M; i++) {
            ps[i] += ps[i - 1] + cnt[i];
        }

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            if (x > M)
                System.out.println(n);
            else
                System.out.println(ps[x - 1]);
        }
    }

}
