package quera.algorithm.season2;

import java.util.Scanner;

public class LargestSubarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long ans = Integer.MIN_VALUE;

        for (int r = 0; r < n; r++) {  //The outer loops iterate through all possible subarrays.// The variable r represents the end of the subarray, and l represents the start of the subarray.
            for (int l = 0; l <= r; l++) {
                long sum = 0;
                for (int i = l; i <= r; i++) { //The innermost loop calculates the sum of the subarray from index l to r
                    sum += arr[i];
                }
                if (sum > ans) {
                    ans = sum;
                }
            }
        }
        System.out.println(ans);
    }
}
