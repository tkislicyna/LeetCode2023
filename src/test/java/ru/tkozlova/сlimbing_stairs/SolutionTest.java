package ru.tkozlova.сlimbing_stairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        Assertions.assertEquals(3, solution.climbStairs(3));
        Assertions.assertEquals(5, solution.climbStairs(4));
    }
}
