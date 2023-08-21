package ru.tkozlova.merge_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test() {
        Solution s = new Solution();
        var list = new int[]{1,2,3,0,0,0};
        s.merge(list, 3, new int[]{2,5,6} , 3);

        Assertions.assertArrayEquals(new int[]{1,2,2,3,5,6}, list);
    }
}
