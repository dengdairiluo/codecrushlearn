package com.yuren.codecrushlearn.Q0;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-28 23:12
 */
public class Q2114 {

    public int calScore(String solution, String guess) {
        Map<Character, Integer> memo = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            if (solution.charAt(i) == guess.charAt(i)) {
                cnt++;
            } else {
                memo.put(solution.charAt(i), memo.getOrDefault(solution.charAt(i), 0) + 1);
                memo.put(guess.charAt(i), memo.getOrDefault(guess.charAt(i), 0) - 1);
            }
        }
        int ans = cnt * 5 + 4 - cnt;
        for (int i : memo.values()) {
            if (i > 0) {
                ans -= i;
            }
        }
        return ans;
    }
}

