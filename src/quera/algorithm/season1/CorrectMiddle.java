package quera.algorithm.season1;

import java.util.Arrays;
import java.util.Scanner;

public class CorrectMiddle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userFirsInput = scanner.nextInt();

        int[] a = new int[userFirsInput];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int n = a.length;
        Arrays.sort(a);
        int M;
//        if (n % 2 == 1) { //odd condition
            M = a[(n - 1) / 2];

//        } else {
//            M = a[(n / 2) - 1];
//        }

        long ans = 0;
        for (int j : a) {
            ans += Math.abs(j - M);
        }

        System.out.println(M + " " + ans);

    }
}
