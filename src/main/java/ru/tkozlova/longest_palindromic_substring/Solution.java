package ru.tkozlova.longest_palindromic_substring;

public class Solution {

    private String palindrome;

    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        palindrome = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            extracted(s, i, i + 1);
            extracted(s, i - 1, i + 1);
        }

        return palindrome;
    }

    private void extracted(String s, int leftValue, int rightValue) {
        if (leftValue < 0 || rightValue >= s.length()) {
            return;
        }

        var left = leftValue;
        var right = rightValue;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if (left != leftValue && (left < 0 || right >= s.length() || s.charAt(left) != s.charAt(right))) {
            left++;
            right--;
        }

        if (s.charAt(left) == s.charAt(right) && palindrome.length() < right + 1 - left) {
            palindrome = s.substring(left, right + 1);
        }
    }
}
