package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-03 23:59
 */
public class Q2102 {
    public int atoi(String str) {
        int i = 0;
        // 先去掉开头的空格
        while (i < str.length() && str.charAt(i) == ' ') ++i;
        if (i == str.length()) return 0;

        // 解析正负号
        int flag = 1;
        if (str.charAt(i) == '-') {
            flag = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }

        // 逐位解析
        int num = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            num *= 10;
            num += str.charAt(i) - '0';
            i++;
        }

        return flag * num;
    }
}
