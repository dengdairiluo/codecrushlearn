package com.yuren.codecrushlearn.Q2200;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-08 23:54
 */
public class Q2206 {

    /**
     * 单调递增数字最后一位减一，后面的都设置为9
     * @param n
     * @return
     */
    private static int findMonotoneIncreasingNum(int n){
        if (n <= 9) return n;
        char[] digits = String.valueOf(n).toCharArray();
        char maxDigit = '0';
        int lastIncreaseIndex = -1;
        for (int i = 0; i < digits.length - 1; i++) {
            if (maxDigit < digits[i]) {
                maxDigit = digits[i];
                lastIncreaseIndex = i;
            }
            //出现了非递增的情况，则把最后一个递增位-1，后面的都设置为9
            if (digits[i] > digits[i + 1]) {
                digits[lastIncreaseIndex] -= 1;
                for(int j = lastIncreaseIndex + 1;j < digits.length;j++) {
                    digits[j] = '9';
                }
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        System.out.println(findMonotoneIncreasingNum(100000));
        System.out.println(findMonotoneIncreasingNum(552));
        System.out.println(findMonotoneIncreasingNum(652));
    }
}
