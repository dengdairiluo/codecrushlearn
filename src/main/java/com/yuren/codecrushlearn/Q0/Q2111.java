package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-21 23:48
 */
public class Q2111 {
    public void setZeros(int[][] matrix, int n, int m) {
        if (m == 0) return;
        int[] row = new int[n];
        int[] column = new int[m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                }
            }
        }
    }
}
