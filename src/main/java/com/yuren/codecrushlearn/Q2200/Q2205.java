package com.yuren.codecrushlearn.Q2200;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-06 23:36
 */
public class Q2205 {
    List<Integer> joinBoard(int s, int t, int k) {
        List<Integer> res = new ArrayList<>();
        int shorter = s;
        int longer = t;
        if (shorter > longer) {
            shorter = t;
            longer = s;
        }
        for (int lNum = 0; lNum <= k; lNum++) {
            res.add(lNum * longer + (k - lNum) * shorter);
        }
        return res;
    }
}
