package com.yuren.codecrushlearn.Q2200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-19 23:48
 */
public class Q2211 {
    public List<Integer> printMatrix(int[][] matrix, int n, int m) {
        final int inf = -1;
        int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int N = n * m;
        List<Integer> ans = new ArrayList<>();
        for (int i=0, k = 0, x = 0, y = -1; i < N; ) {
            int nx, ny;
            nx = x + d[k][0];
            ny = y + d[k][1];
            if (nx < 0 || nx == n || ny < 0 || ny == m || matrix[nx][ny] == inf) {
                k = (k + 1) % 4;
            } else {
                i++;
                ans.add(matrix[nx][ny]);
                x = nx;
                y = ny;
                matrix[nx][ny] = inf;
            }
        }
        return ans;
    }
}
