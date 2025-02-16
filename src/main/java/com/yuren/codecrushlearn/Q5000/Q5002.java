package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-16 23:43
 */
public class Q5002 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0; // 存储无重复数据的最大下标
        for (int i = 1; i < n; ++i) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
