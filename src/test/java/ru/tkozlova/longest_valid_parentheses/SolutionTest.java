package ru.tkozlova.longest_valid_parentheses;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();
        System.out.println(solution.longestValidParentheses(")()())"));
        System.out.println(solution.longestValidParentheses("(()"));
        System.out.println(solution.longestValidParentheses("(())("));
        System.out.println(solution.longestValidParentheses("()(()"));
    }
}
