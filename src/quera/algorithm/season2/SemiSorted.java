package quera.algorithm.season2;

import java.util.Scanner;

public class SemiSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        String result = semiSorted(arr, n);
        System.out.println(result);

    }
    public static String semiSorted(int[] p, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(p, i, j);
                boolean sorted = true;
                for (int k = 1; k < n; k++) {
                    if (p[k] < p[k - 1]) {
                        sorted = false;
                        break;
                    }
                }
                if (sorted) {
                    return "YES";
                }
                swap(p, i, j); // Swap back to the original state
            }
        }
        return "NO";
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
