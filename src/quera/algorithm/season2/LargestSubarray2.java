package quera.algorithm.season2;

import java.util.Scanner;

public class LargestSubarray2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long ans = Integer.MIN_VALUE;

        for (int l = 0; l < n; l++) {
            long sum = 0;
            for (int r = l; r < n; r++) { // skip third for loop - Solved by O(n^2)
                sum += arr[r];
                if (sum > ans) {
                    ans = sum;
                }
            }
        }

        System.out.println(ans);
    }
}
