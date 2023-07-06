package ru.tkozlova.string_to_integer;

public class Solution {
    public int myAtoi(String s) {
        int[] chars = s.chars().toArray();

        StringBuilder builder = new StringBuilder();
        boolean positive = true;
        char firstSignOrZeroSymbol = 0;

        for (int c : chars) {
            if (c == 32) { // white space
                if (builder.length() != 0 || firstSignOrZeroSymbol != 0) {
                    break;
                }
            } else if (c == 45) { // -
                if (builder.length() != 0 || firstSignOrZeroSymbol != 0) {
                    break;
                } else {
                    positive = false;
                    firstSignOrZeroSymbol = '-';
                }
            } else if (c == 43) { // +
                if (builder.length() != 0 || firstSignOrZeroSymbol != 0) {
                    break;
                } else {
                    firstSignOrZeroSymbol = '+';
                }
            } else if (c == 48) { // 0
                if (builder.length() != 0) {
                    builder.append((char) c);
                } else if (firstSignOrZeroSymbol == 0) {
                    firstSignOrZeroSymbol = '0';
                }
            } else if (c >= 49 && c <= 57) { // 1-9
                builder.append((char) c);
            } else {
                break;
            }

            if (builder.length() == 11) {
                break;
            }
        }

        if (builder.length() == 0) {
            return 0;
        }

        if (!positive) {
            builder.insert(0, '-');
        }

        String result = builder.toString();

        if (!positive && equalsOrExceedsExtremeValue(result, Integer.MIN_VALUE)) {
            return Integer.MIN_VALUE;
        } else if (positive && equalsOrExceedsExtremeValue(result, Integer.MAX_VALUE)) {
            return Integer.MAX_VALUE;
        } else {
            return Integer.parseInt(result);
        }

    }

    private boolean equalsOrExceedsExtremeValue(String value, int extremeValue) {
        String extremeValueString = String.valueOf(extremeValue);
        return extremeValueString.length() < value.length() ||
                value.length() == extremeValueString.length() && extremeValueString.compareTo(value) < 0;
    }
}
