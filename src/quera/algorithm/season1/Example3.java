package quera.algorithm.season1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3 {

    private void changeOrder(int number) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));
//1234 ==> 4123 , 3412
        int[] cloneNumbers = new int[4];
        for (int i = 0; i < numbers.size(); i++) {  // o(n)
            int p = (number + i) % numbers.size();
            cloneNumbers[p] = (numbers.get(i));
        }
        System.out.println("SHIFTED ARRAY ==>" + Arrays.toString(cloneNumbers));
    }

    public static void main(String[] args) {
//O(n^2)
        Example3 example3 = new Example3();
        example3.changeOrder(1);

    }

}
