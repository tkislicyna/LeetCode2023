package ru.tkozlova.find_first_and_last_position;

public class Solution {
    public int[] searchRange(int[] nums, int target) {


        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }

        int[] result = new int[]{-1, -1};
        inner(0, nums.length - 1, nums, target, result);

        return result;
    }

    private void inner(int start, int end, int[] nums, int target, int[] result) {

        if (nums[end] < target || nums[start] > target) {
            return;
        }

        if (nums[start] == target && result[0] == -1 || result[0] > start) {
            result[0] = start;
        }

        if (nums[end] == target && (result[1] == -1 || result[1] < end)) {
            result[1] = end;
        }

        if (end <= start) {
            return;
        }

        var center = start + (end - start) / 2;

        inner(start, center, nums, target, result);
        inner(center + 1, end, nums, target, result);
    }
}
