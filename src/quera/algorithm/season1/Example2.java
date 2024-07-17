package quera.algorithm.season1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * improve memory fir Example allocation in foreach with binary-search
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userFirsInput = scanner.nextLine();
        String[] numbers = userFirsInput.split(" ");
        int n = Integer.parseInt(numbers[0]);
        int q = Integer.parseInt(numbers[1]);

        String userSecondInput = scanner.nextLine();
        String[] secondNumbers = userSecondInput.split(" ");


        int[] as = new int[q]; // its better use array instead of list for better performance
        for (int i = 0; i < q; i++) {
            as[i] = scanner.nextInt();
        }

        int[] intSecondNumbers = Arrays.stream(secondNumbers)
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(intSecondNumbers);

        for (int i : as) {
            int count = binarySearchCount(intSecondNumbers, i);
            System.out.println(count);
        }
    }

    private static int binarySearchCount(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int count = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] < target) {
                count = mid + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return count;
    }
}
