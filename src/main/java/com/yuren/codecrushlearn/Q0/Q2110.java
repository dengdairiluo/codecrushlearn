package com.yuren.codecrushlearn.Q0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-19 23:38
 */
public class Q2110 {
    public List<Integer> yanghui(int n) {
        int[][] arr = new int[2][n];
        arr[0][0] = 1;
        int curr = 0;
        for (int i = 2; i <= n; ++i) {
            curr = (i % 2 + 1) % 2;
            int prev = i % 2;
            arr[curr][0] = 1;
            for (int j = 1; j < i - 1; ++j) {
                arr[curr][j] = arr[prev][j - 1] + arr[prev][j];
            }
            arr[curr][i - 1] = 1;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            res.add(arr[curr][i]);
        }
        return res;
    }

    /**
     * 数学是第一生产力
     * @param n
     * @return
     */
    private static List<Integer> yanghui2(int n) {
        List<Integer> res = new ArrayList<>(n);
        long cur = 1;
        for (int i = 0; i < n; i++) {
            res.add((int) cur);
            cur = cur * (n - i - 1) / (i + 1);
        }
        return res;
    }
}
