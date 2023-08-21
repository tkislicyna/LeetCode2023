package ru.tkozlova.matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        var result = solution.updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}});

        Arrays.stream(result).forEach( arr -> System.out.println(Arrays.toString(arr)));
    }
}
