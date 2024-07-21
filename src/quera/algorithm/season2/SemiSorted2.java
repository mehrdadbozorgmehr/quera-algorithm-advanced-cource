package quera.algorithm.season2;

import java.util.Scanner;

public class SemiSorted2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int length = arr.length;

        String result = isSemiSorted(arr, length);
        System.out.println(result);  // Output
    }

    public static String isSemiSorted(long[] p, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (p[i] != i + 1) {  // Adjusting for zero-based index
                count++;
            }
        }

        if (count == 2) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
