package com.yuren.codecrushlearn.Q2200;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-03 02:17
 */
public class Q2203 {
    int select(int[] votes, int n){
        int candidate = 0;
        int counter = 0;
        for (int vote : votes) {
            if (counter == 0) {
                candidate = vote;
            }
            if (vote == candidate) {
                counter++;
            } else {
                counter--;
            }
        }
        // 已知有一位候选人的票数过半,因此不用再判读是否存在
        // 即，只有一个候选人，投他大于不投他
        return candidate;
    }
}
