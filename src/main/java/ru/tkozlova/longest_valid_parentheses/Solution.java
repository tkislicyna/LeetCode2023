package ru.tkozlova.longest_valid_parentheses;

public class Solution {
    public int longestValidParentheses(String s) {

        var maxLen = 0;
        for (int i = 0; i < s.length(); i++) {

            int opened = 0;
            int closed = 0;

            int len = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == ')') {
                    closed++;
                }

                if (s.charAt(j) == '(') {
                    opened++;
                }


                if (closed > opened) {
                    break;
                }

                if (closed == opened) {
                    len = closed * 2;
                }
            }

            if (maxLen < len) {
                maxLen = len;
            }
        }

        return maxLen;
    }
}
