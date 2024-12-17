package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-17 23:27
 */
public class Q2109 {
    public int clean(int[][] matrix, int n, int m) {
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};
        int x = (n - 1) >> 1;
        int y = (m - 1) >> 1;
        int ans = matrix[x][y];
        matrix[x][y] = 0;
        while (true) {
            int maxV = 0;
            int d = -1;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && matrix[nx][ny] > maxV) {
                    maxV = matrix[nx][ny];
                    d = i;
                }
            }
            if (maxV == 0) {
                break;
            }
            ans += maxV;
            x = x + dx[d];
            y = y + dy[d];
            matrix[x][y] = 0;
        }
        return ans;
    }
}
