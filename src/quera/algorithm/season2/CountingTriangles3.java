package quera.algorithm.season2;

import java.util.Scanner;

public class CountingTriangles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int a = 1; a <= n / 3; a++) {
            ans += (n - 3 * a) / 2 - Math.max(0, n / 2 - 2 * a + 1) + 1;
        }
        System.out.println(ans);
    }
}
