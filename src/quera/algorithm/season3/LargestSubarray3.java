package quera.algorithm.season3;

import java.util.Scanner;

public class LargestSubarray3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long ans = arr[0];
        long maxsum = arr[0];

        for (int i = 1; i < n; i++) {
            maxsum = Math.max(maxsum + arr[i], arr[i]);
            ans = Math.max(ans, maxsum);
        }

        System.out.println(ans);
    }
}
