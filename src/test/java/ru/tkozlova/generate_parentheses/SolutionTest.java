package ru.tkozlova.generate_parentheses;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        var list = solution.generateParenthesis(3);

        System.out.println(list);
    }

}
