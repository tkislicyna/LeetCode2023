package ru.tkozlova.jump_game_ii;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        var result = solution.jump(new int[]{2, 3, 1, 1, 4});

        System.out.println(result);
    }
}
