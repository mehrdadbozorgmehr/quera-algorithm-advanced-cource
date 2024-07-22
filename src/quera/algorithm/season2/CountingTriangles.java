package quera.algorithm.season2;

import java.util.Scanner;

public class CountingTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;

        for (int a = 0; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                for (int c = b; c <= n; c++) {
                    if (a + b + c == n && a + b > c) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
