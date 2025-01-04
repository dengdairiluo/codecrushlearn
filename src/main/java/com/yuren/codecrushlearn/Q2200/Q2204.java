package com.yuren.codecrushlearn.Q2200;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-05 00:47
 */
public class Q2204 {
    boolean placeDogs(int[] dogHouses, int n, int k) {
        // 检查边界条件
        if (n == 0) return k == 0;
        if (k == 0) return true;
        // 使用贪心算法，尽可能地放置狗
        for (int i = 0; i < n; i++) {
            if (dogHouses[i] != 0) {// 该位置已经放置了狗
                continue;
            }
            boolean isLeftEmpty = i - 1 < 0 || dogHouses[i - 1] == 0;
            boolean isRightEmpty = i + 1 >= n || dogHouses[i + 1] == 0;
            if (isLeftEmpty && isRightEmpty) {//左右都没有狗，则放狗
                dogHouses[i] = 1;
                k--;
                if (k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
