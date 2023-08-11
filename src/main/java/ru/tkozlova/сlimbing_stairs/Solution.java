package ru.tkozlova.сlimbing_stairs;

public class Solution {
    public int climbStairs(int n) {

        var prev = 1;
        var prevPrev = 0;

        var result = 0;
        for (var i = 0; i < n; i++) {
            result = prev + prevPrev;

            prevPrev = prev;
            prev = result;
        }

        return result;
    }
}
