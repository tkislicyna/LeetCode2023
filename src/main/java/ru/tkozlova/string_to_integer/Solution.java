package ru.tkozlova.string_to_integer;

public class Solution {

    public static final int MAX_NUMBER_COUNT = 11;

    public int myAtoi(String s) {

        char[] resultChars = new char[MAX_NUMBER_COUNT];
        int charsCount = 0;

        boolean positive = true;
        char firstSignOrZeroSymbol = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') {
                if (charsCount != 0) {
                    resultChars[charsCount] = c;
                    charsCount++;
                } else if (firstSignOrZeroSymbol == 0) {
                    firstSignOrZeroSymbol = '0';
                }
            } else if (c >= '1' && c <= '9') {
                resultChars[charsCount] = c;
                charsCount++;
            } else if (c == ' ') {
                if (firstSignOrZeroSymbol != 0 || charsCount != 0) {
                    break;
                }
            } else if (c == '-') { // -
                if (firstSignOrZeroSymbol != 0 || charsCount != 0) {
                    break;
                } else {
                    positive = false;
                    firstSignOrZeroSymbol = '-';
                }
            } else if (c == '+') {
                if (firstSignOrZeroSymbol != 0 || charsCount != 0) {
                    break;
                } else {
                    firstSignOrZeroSymbol = '+';
                }
            } else {
                break;
            }

            if (charsCount == MAX_NUMBER_COUNT) {
                break;
            }
        }

        if (charsCount == 0) {
            return 0;
        }

        resultChars = fixChars(resultChars, charsCount, positive);

        if (!positive && equalsOrExceedsExtremeValue(resultChars, Integer.MIN_VALUE)) {
            return Integer.MIN_VALUE;
        } else if (positive && equalsOrExceedsExtremeValue(resultChars, Integer.MAX_VALUE)) {
            return Integer.MAX_VALUE;
        } else {
            return parseInt();
        }
    }

    private char[] fixChars(char[] chars, int charsCount, boolean positive) {
        char[] resultChars = new char[charsCount];
        int charsIndex = 0;

        if (!positive) {
            resultChars = new char[charsCount + 1];
            resultChars[charsIndex] = '-';
            charsIndex++;
        }

        for (int i = 0; i < charsCount; i++) {
            resultChars[charsIndex] = chars[i];
            charsIndex++;
        }

        return resultChars;
    }

    private boolean equalsOrExceedsExtremeValue(char[] value, int extremeValue) {
        String extremeValueString = String.valueOf(extremeValue);

        if (extremeValueString.length() < value.length) {
            return true;
        } else if (extremeValueString.length() > value.length) {
            return false;
        }

        boolean equals = true;

        for (int i = 0; i < value.length; i++) {
            if (value[i] > extremeValueString.charAt(i)) {
                return true;
            } else if (value[i] < extremeValueString.charAt(i)) {
                equals = false;
                break;
            }
        }
        return equals;
    }

    private int parseInt() {
        // TODO
        return 1;
    }
}
