package ru.tkozlova.find_first_and_last_position;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        var result = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);

        Assertions.assertArrayEquals(new int[]{3, 4}, result);
    }
}
