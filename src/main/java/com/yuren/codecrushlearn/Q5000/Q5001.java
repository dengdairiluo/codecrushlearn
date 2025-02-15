package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-15 22:56
 */
public class Q5001 {
    public String rotate(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        k = k % n;
        // 右移k位
        for (int i = 0; i < k; ++i) {
            char tmp = str[n-1];
            for (int j = n-1; j > 0; --j) {
                str[j] = str[j-1];
            }
            str[0] = tmp;
        }
        return new String(str);
    }
}
