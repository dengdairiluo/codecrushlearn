package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-17 23:27
 */
public class Q2109 {
    private static int clean(int[][] matrix, int n, int m) {
        // 四个方向矩阵
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};

        // 找中间点
        int x = (n - 1) >> 1;
        int y = (m - 1) >> 1;
        int ans = matrix[x][y];
        matrix[x][y] = 0;


        while (true) {
            int maxV = 0;
            int d = -1; // maxV时的i
            //上下左右找最大值maxV
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && matrix[nx][ny] > maxV) {
                    maxV = matrix[nx][ny];
                    d = i;
                }
            }

            if (maxV == 0) {
                // 上下左右都没垃圾就跳出
                break;
            }
            // 累加然后移动
            ans += maxV;
            x = x + dx[d];
            y = y + dy[d];
            matrix[x][y] = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{5, 7, 6, 3},
                {2, 4, 8, 12},
                {3, 5, 10, 7},
                {4, 16, 4, 17}};
        System.out.println(clean(matrix, 4, 4));
    }
}
