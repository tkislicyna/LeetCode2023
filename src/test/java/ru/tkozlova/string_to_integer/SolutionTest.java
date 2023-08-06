package ru.tkozlova.string_to_integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution uut = new Solution();

    @Test
    void test1() {
        int result = uut.myAtoi("42");
        Assertions.assertEquals(42, result);
    }

    @Test
    void test2() {
        int result = uut.myAtoi("   -42");
        Assertions.assertEquals(-42, result);
    }

    @Test
    void test3() {
        int result = uut.myAtoi("4193 with words");
        Assertions.assertEquals(4193, result);
    }

    @Test
    void test4() {
        int result = uut.myAtoi("2147483648"); // Integer.MAX_VALUE + 1
        Assertions.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    void test5() {
        int result = uut.myAtoi("2147483647");
        Assertions.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    void test6() {
        int result = uut.myAtoi("2147483646");
        Assertions.assertEquals(2147483646, result);
    }


    @Test
    void test7() {
        int result = uut.myAtoi("2147483648");
        Assertions.assertEquals(2147483647, result);
    }

    @Test
    void test8() {
        int result = uut.myAtoi("-2147483648");
        Assertions.assertEquals(Integer.MIN_VALUE, result); // 2147483648
    }

    @Test
    void test9() {
        int result = uut.myAtoi("-2147483647");
        Assertions.assertEquals(-2147483647, result);
    }

    @Test
    void test10() {
        int result = uut.myAtoi("-2147483649"); // Integer.MIN_VALUE - 1
        Assertions.assertEquals(-2147483648, result);
    }

    @Test
    void test11() {
        int result = uut.myAtoi("+1");
        Assertions.assertEquals(1, result);
    }

    @Test
    void test12() {
        int result = uut.myAtoi("+01");
        Assertions.assertEquals(1, result);
    }

    @Test
    void test13() {
        int result = uut.myAtoi("0+1");
        Assertions.assertEquals(0, result);
    }

    @Test
    void test14() {
        int result = uut.myAtoi("-000000000000001");
        Assertions.assertEquals(-1, result);
    }

    @Test
    void test15() {
        int result = uut.myAtoi("--1");
        Assertions.assertEquals(0, result);
    }

    @Test
    void test16() {
        var timeStart = System.currentTimeMillis();
        int result = uut.myAtoi("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001199999991");
        var timeEnd = System.currentTimeMillis();
        Assertions.assertEquals(1199999991, result);


        System.out.println(timeEnd - timeStart);
    }

    @Test
    void test17() {
        int result = uut.myAtoi("   +0 123");
        Assertions.assertEquals(0, result);
    }

    @Test
    void test18() {
        int result = uut.myAtoi("2147483800");
        Assertions.assertEquals(2147483647, result);
    }

    @Test
    void test19() {
        int result = uut.myAtoi("1095502006p8");
        Assertions.assertEquals(1095502006, result);
    }



}
