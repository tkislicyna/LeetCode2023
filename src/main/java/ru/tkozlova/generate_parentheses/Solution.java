package ru.tkozlova.generate_parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        return getVariants("(", n - 1, n, n, new ArrayList<>());
    }

    private List<String> getVariants(String current, int open, int close, int n, List<String> result) {

        if (current.length() == 2 * n) {
            result.add(current);
        }

        if (open > 0) {
            getVariants(current + "(", open - 1, close, n, result);
        }

        if (open < close) {
            getVariants(current + ")", open, close - 1, n, result);
        }

        return result;
    }
}