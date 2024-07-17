package quera.algorithm.season1;

public class PowerOfTwo {

    // Recursive method to calculate 2^x
    public static int pow2(int x) {
        // Base case: if x is 0, return 1
        if (x == 0) {
            return 1;
        }
        // Recursive case: return 2 * pow2(x - 1)
        return 2 * pow2(x - 1);
    }

    public static void main(String[] args) {
        // Example usage: calculate 2^n where n is a given integer
        int n = 5; // You can change this value to test with other inputs
        int result = pow2(n);
        System.out.println("2^" + n + " = " + result);
    }
}
