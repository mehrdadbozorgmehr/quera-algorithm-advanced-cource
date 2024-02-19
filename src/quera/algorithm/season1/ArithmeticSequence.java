package quera.algorithm.season1;

import java.util.Scanner;

public class ArithmeticSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] firstAs = new int[n];

        for (int i = 0; i < n; i++) {
            firstAs[i] = scanner.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        int min = findMin(firstAs);
        int max = findMax(firstAs);

        for (int x = min - (n - 1) * k; x <= max; x++) {
            int cost = 0;
            for (int i = 1; i <= n; i++) {
                cost += Math.abs(x + (i - 1) * k - firstAs[i - 1]);
            }

            if (cost < ans) {
                ans = cost;
            }
        }

        System.out.println(ans);


    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
