package interview.prep.algorithms.dailytemperatures;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test void findsNextWarmerDay() {
        assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, Solution.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
    }
    @Test void returnsZerosWhenNoWarmerDayExists() {
        assertArrayEquals(new int[]{0,0,0}, Solution.dailyTemperatures(new int[]{80,79,78}));
    }
}

