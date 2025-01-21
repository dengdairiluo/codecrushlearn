package com.yuren.codecrushlearn.Q2200;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-20 23:54
 */
public class Q2212 {
    public boolean findTargetInMatrix(int[][] matrix, int n, int m, int target) {
        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
              // 大于目标值，向左移动
            } else if (matrix[i][j] > target) {
                j--;
              // 小于目标值，向下移动
            } else {
                i++;
            }
        }

        return false;
    }
}
