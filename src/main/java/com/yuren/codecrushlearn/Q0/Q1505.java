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
        if (end <= begin) {
            return "-";
        }

        int first = begin + 1;
        int last = end;

        StringBuilder sb = new StringBuilder();
        for (int i = first; i < last; i++) {
            for (int j = 0; j < p2; j++) {
                char c = getAppendChar(p1, (char) i);
                sb.append(c);
            }
        }

        boolean needReverse = (p3 == 2);
        if (needReverse) {
            sb.reverse();
        }
        return sb.toString();
    }

    private char getAppendChar(int p1, char c) {
        if(p1 == 3){
            return '*';
        }
        if (p1 == 2 && isAlphabet(c)) {
            return toUpperCase(c);
        }
        return c;
    }

    private char toUpperCase(char first) {
        return (char) (first - 'a' + 'A');
    }

    private boolean isAlphabet(int c) {
        return c >= 'a' && c <= 'z';
    }
}
