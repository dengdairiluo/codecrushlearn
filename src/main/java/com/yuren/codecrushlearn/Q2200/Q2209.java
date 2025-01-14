package com.yuren.codecrushlearn.Q2200;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-15 01:16
 */
public class Q2209 {
    public boolean jump(int[] nums) {
        int n = nums.length;
        int maxReach = 0; // 记录当前能跳到的最远位置

        for (int i = 0; i < n; i++) {
            // 如果当前下标超过了能跳到的最远位置，则返回 false
            if (i > maxReach) {
                return false;
            }
            // 更新能跳到的最远位置
            maxReach = Math.max(maxReach, i + nums[i]);
            // 如果能跳到或超过数组的最后一个位置，则返回 true
            if (maxReach >= n - 1) {
                return true;
            }
        }
        return false; // 如果循环结束后，仍然不能到达最后一个位置，则返回 false
    }
}
