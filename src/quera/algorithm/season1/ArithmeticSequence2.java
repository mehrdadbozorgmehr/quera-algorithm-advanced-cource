package quera.algorithm.season1;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticSequence2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt() - (long) (i) * k;
        }
        long ans = Long.MAX_VALUE;
        int len = a.length;
        Arrays.sort(a);
        long M = a[(len - 1) / 2];
        long cost = 0;
        for (int i = 0; i < n; i++) {
            cost += Math.abs(a[i] - M);
        }
        if (cost < ans) {
            ans = cost;
        }
        System.out.println(ans);
    }

}
