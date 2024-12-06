package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-05 23:44
 */
public class Q2103 {
    public int atoi(String s) {
        int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        boolean sign = false;
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = s.charAt(i) == '-';
            i++;
        }
        int ans = 0;
        int maxV = Integer.MAX_VALUE / 10;
        for (; i < n && Character.isDigit(s.charAt(i)); i++) {
            int v = s.charAt(i) - '0';
            // 溢出的两种形态  10 * ans > Integer.MAX_VALUE 或 最后一位溢出 > 8 或 < -7
            if (ans > maxV || ans == maxV && (!sign && v > 7 || sign && v > 8)) {
                return 0;
            }
            ans = ans * 10 + v;
        }
        if (sign) {
            return -ans;
        }
        return ans;
    }
}
