package ru.tkozlova.minimum_path_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        var result = solution.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});

        Assertions.assertEquals(7, result);
    }
}
