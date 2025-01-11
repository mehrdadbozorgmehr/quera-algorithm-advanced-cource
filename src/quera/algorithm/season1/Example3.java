package quera.algorithm.season1;

import java.util.Arrays;

public class Example3 {

    private void changeOrder(int k, int... numbers) {
        //1234 ==> 4123 , 3412
        int[] cloneNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {  // o(n)
            int p = (k + i) % numbers.length;
            cloneNumbers[p] = numbers[i];
        }
        System.out.println("SHIFTED ARRAY ==>" + Arrays.toString(cloneNumbers));
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }

    public static void main(String[] args) {
        //O(n^2)
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        Example3 example3 = new Example3();
        example3.changeOrder(3, numbers);

    }

}
