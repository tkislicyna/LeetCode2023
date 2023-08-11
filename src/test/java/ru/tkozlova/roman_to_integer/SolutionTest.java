package ru.tkozlova.roman_to_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        Assertions.assertEquals(58, solution.romanToInt("LVIII"));

        Assertions.assertEquals(1994, solution.romanToInt("MCMXCIV"));

        Assertions.assertEquals(3, solution.romanToInt("III"));
    }
}
