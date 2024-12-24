package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-24 01:00
 */
public class Q2112 {
    public boolean editWord(String wrongWord, String correctWord) {
        int m = wrongWord.length(), n = correctWord.length();
        if (Math.abs(m - n) > 1) return false;
        int i = 0, j = 0;
        int count = 0;
        while (i < m && j < n) {
            // 逐位比较，如果不同。计数。两个单词位数相同比较下一位，否则插入补位
            if (wrongWord.charAt(i) != correctWord.charAt(j)) {
                count++; // 编辑次数
                if (m == n) { // 替换
                    i++;
                    j++;
                } else if (m > n) { // 删除和添加
                    i++;
                } else {
                    j++;  // 删除和添加
                }
            } else {
                i++;
                j++;
            }
        }
        // 跳过次数多于1, 肯定不能一次替换
        return count <= 1;
    }
}
