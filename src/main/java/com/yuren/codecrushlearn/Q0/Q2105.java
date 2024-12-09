package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-09 23:53
 */
public class Q2105 {

    public String zip(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        compressed.append(str.charAt(str.length() - 1)).append(count);

        if (compressed.length() >= str.length()) {
            return str;
        } else {
            return compressed.toString();
        }
    }
}
