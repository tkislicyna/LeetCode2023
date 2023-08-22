package ru.tkozlova.sum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> lists = new ArrayList<>();

        var prev = -1;
        for (int i = 0; i < nums.length - 2; i++) {
            if (prev != -1 && nums[prev] == nums[i]) {
                continue;
            }

            prev = i;

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                var sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    lists.add(List.of(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return lists;
    }
}
