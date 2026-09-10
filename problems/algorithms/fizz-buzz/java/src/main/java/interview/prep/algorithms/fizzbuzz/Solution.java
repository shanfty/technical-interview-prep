package interview.prep.algorithms.fizzbuzz;

import java.util.List;
import java.util.ArrayList;

public class Solution {

    public static List<Object> fizzBuzz(int n) {
        if (n <= 0) {
            return List.of();
        }

        List<Object> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result.add("fizzbuzz");
            } else if (i % 3 == 0) {
                result.add("fizz");
            } else if (i % 5 == 0) {
                result.add("buzz");
            } else {
                result.add(i);
            }
        }
        return result;
    }
}
