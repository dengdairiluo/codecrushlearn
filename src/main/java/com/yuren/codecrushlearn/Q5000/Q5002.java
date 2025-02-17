package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-16 23:43
 */
public class Q5002 {
    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0; // 存储无重复数据的最大下标
        for (int i = 1; i < n; ++i) {
            if (nums[i] != nums[k]) {
                // 找到一个新的不重复数据, 就计数
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] source = new int[]{2,2,3,6,6,6,7};
        System.out.println(removeDuplicates(source));
        System.out.println(source.length);
    }
}
