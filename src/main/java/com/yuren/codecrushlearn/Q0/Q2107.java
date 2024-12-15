package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-14 23:15
 */
public class Q2107 {
    private static final String ZERO = "零";
    private static final String[] STRINGS = {"", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    private static final String[] TENS = {"", "十", "百", "千"};
    private static final String[] UNITS = {"", "万", "亿"};

    private static String formatInteger(int num) {
        int size = ZERO.length();

        StringBuilder sb = new StringBuilder();
        // 拆亿、万、个
        for (int i = 2, unit = 10000_0000; i >= 0; i--) {
            int cur = num / unit;
            if (cur > 0) {
                StringBuilder s = new StringBuilder();
                // 每个内部拆千、百、十
                for (int j = 3, u = 1000, last = -1; j >= 0; j--) {
                    int v = cur / u;
                    if (v > 0) {
                        // 数字转字符串
                        s.append(STRINGS[v]);
                        s.append(TENS[j]);
                    } else if ((!sb.isEmpty() || !s.isEmpty()) && last != 0) {
                        // 补零
                        s.append(ZERO);
                    }
                    last = v;
                    cur %= u;
                    u /= 10;
                }
                String a = s.toString();
                if (a.length() > size && a.substring(a.length() - size).equals(ZERO)) {
                    a = a.substring(0, a.length() - size);
                }
                sb.append(a);
                sb.append(UNITS[i]);
                num %= unit;
            }
            unit /= 10000;
        }
        if (sb.isEmpty()) {
            return ZERO;
        }
        String ans = sb.toString();
        // 一十五万转十五万
        if (ans.startsWith("一十")) {
            return ans.substring(size);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(formatInteger(150000));
    }
}
