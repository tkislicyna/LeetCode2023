package ru.tkozlova.jump_game_ii;

class Solution {
    public int jump(int[] nums) {
        int[] steps = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            var maxStep = Math.min(nums.length - i - 1, nums[i]);
            for (int j = 1; j <= maxStep; j++) {
                if (steps[i + j] == 0 || steps[i + j] > steps[i] + 1) {
                    steps[i + j] = steps[i] + 1;
                }
            }
        }
        return steps[nums.length - 1];
    }
}

