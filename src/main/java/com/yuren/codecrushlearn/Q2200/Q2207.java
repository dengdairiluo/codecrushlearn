package com.yuren.codecrushlearn.Q2200;

import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-11 17:25
 */
public class Q2207 {

    public int race(int[] t, int[] q, int n) {
        Arrays.sort(t);
        Arrays.sort(q);

        int winCount = 0;
        int tIndex = n - 1;
        int qIndex = n - 1;

        while (tIndex >= 0 && qIndex >= 0) {
            if (t[tIndex] > q[qIndex]) {
                winCount++;
                tIndex--;
                qIndex--;
            } else {
                qIndex--;
            }
        }

        return winCount;
    }

}
