package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-11-24 02:27
 */
public class Q1505 {
    public String expand(int p1, int p2, int p3, String str) {
        if (str.length() <= 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '-') {
                sb.append(doExpand(p1, p2, p3, str.charAt(i - 1), str.charAt(i + 1)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }

    private String doExpand(int p1, int p2, int p3, char begin, char end) {
        // 如果减号右边的字符按照 ASCII 码的顺序小于或等于左边字符，输出时，要保留中间的减号，例如：d-d 应输出为 d-d，3-1 应输出为 3-1
        if (end <= begin) {
            return "-";
        }

        int first = begin + 1;
        int last = end;

        StringBuilder sb = new StringBuilder();
        // 如果减号右边的字符恰好是左边字符的后继，只删除中间的减号，例如：d-e 应输出为 de，3-4 应输出为 34。
        for (int i = first; i < last; i++) {
            for (int j = 0; j < p2; j++) {
                char c = getAppendChar(p1, (char) i);
                sb.append(c);
            }
        }

        // p3=2 表示采用逆序输出，注意这时候仍然不包括减号两端的字符。
        boolean needReverse = (p3 == 2);
        if (needReverse) {
            sb.reverse();
        }
        return sb.toString();
    }

    private char getAppendChar(int p1, char c) {
        // p1=3 时，不论是字母子串还是数字字串，都用与要填充的字母个数相同的星号 * 来填充
        if(p1 == 3){
            return '*';
        }

        // p1=2 时，对于字母子串，填充大写字母。这两种情况下数字子串的填充方式相同。
        if (p1 == 2 && isAlphabet(c)) {
            return toUpperCase(c);
        }

        // p1=1 时，对于字母子串，填充小写字母；p1=2 时，对于字母子串，填充大写字母。这两种情况下数字子串的填充方式相同。
        return c;
    }

    private char toUpperCase(char first) {
        return (char) (first - 'a' + 'A');
    }

    private boolean isAlphabet(int c) {
        return c >= 'a' && c <= 'z';
    }
}
