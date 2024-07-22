package quera.algorithm.season2;

import java.util.Scanner;

public class CountingTriangles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n - a; b++) {
                int c = n - a - b;
                if (a + b > c && c >= b) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
