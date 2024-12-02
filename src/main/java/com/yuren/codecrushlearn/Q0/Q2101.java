package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-01 23:46
 */
public class Q2101 {

    public boolean validateIp(String ipStr) {
        int numCount = 0;
        int dotCount = 0;
        int num = 0;
        boolean isNum = false;

        for (int i = 0; i < ipStr.length(); i++) {
            char c = ipStr.charAt(i);
            if (isBlank(c)) {
                if (isNum) {
                    numCount++;
                    if (isNumCheck(numCount, dotCount, num)) {
                        isNum = false;
                        num = 0;
                    } else {
                        return false;
                    }
                }
            } else if (idDot(c)) {
                if (isNum) {
                    numCount++;
                    if (isNumCheck(numCount, dotCount, num)) {
                        isNum = false;
                        num = 0;
                    } else {
                        return false;
                    }
                }
                dotCount++;
                if (dotCount > 3) {
                    return false;
                }
                if (dotCount > numCount) {
                    return false;
                }
            } else if (isDigit(c)) {
                if (isNum && num == 0) {
                    return false;
                }
                num = num * 10 + (c - '0');
                isNum = true;
            } else {
                return false;
            }
        }
        if (isNum) {
            numCount++;
            if (num > 255) {
                return false;
            }
        }
        if (numCount != 4) {
            return false;
        }
        if (dotCount != 3) {
            return false;
        }
        return true;
    }

    private boolean isBlank(char c) {
        return c == ' ';
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean idDot(char c) {
        return c == '.';
    }

    private boolean isNumCheck(int numCount, int dotCount, int num) {
        if (numCount > 4) {
            return false;
        }
        if (numCount - dotCount > 1) {
            return false;
        }
        if (num > 255) {
            return false;
        }
        return true;
    }
}
