package ru.tkozlova.merge_sorted_array;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int j = m - 1;
        int k = n - 1;
        for (int i = n + m - 1; i >= 0; i--) {
            var first = j < 0 ? Integer.MIN_VALUE : nums1[j];
            var second = k < 0 ? Integer.MIN_VALUE : nums2[k];

            if (k >= 0 && (first <= second)) {
                nums1[i] = nums2[k];

                if (k == 0) {
                    break;
                }
                k--;
            } else if (j >= 0 && first > second) {
                nums1[i] = nums1[j];
                nums1[j] = 0;
                j--;
            }
        }
    }
}
