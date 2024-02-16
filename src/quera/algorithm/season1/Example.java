package quera.algorithm.season1;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userFirsInput = scanner.nextLine();
        String[] numbers = userFirsInput.split(" ");
        int n = Integer.parseInt(numbers[0]);
        int q = Integer.parseInt(numbers[1]);

        String userSecondInput = scanner.nextLine();
        String[] secondNumbers = userSecondInput.split(" ");
        if (secondNumbers.length > n) {
            throw new IllegalArgumentException("NUMBER IS GREATER THAN CONDITION!");
        }

        int[] as = new int[q]; // its better use array instead of list for better performance
        for (int i = 0; i < q; i++) {
            as[i] = scanner.nextInt();
        }
//
//        qList.forEach(i -> {
//            AtomicInteger count = new AtomicInteger();
//            count.set(0);
//            Arrays.asList(secondNumbers).forEach(xNumber -> {
//                if (Integer.parseInt(xNumber) <= i) {
//                    count.getAndIncrement();
//                }
//            });
//            System.out.println(count.get());
//        });

        for (int i : as) {
            int count = 0;
            for (String xNumber : secondNumbers) {
                if (Integer.parseInt(xNumber) < i) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
