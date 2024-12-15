package com.yuren.codecrushlearn.Q0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-12-15 23:09
 */
public class Q2108 {
    private static final String[] LESS_THAN_20 = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ",
            "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ",
            "Eighteen ", "Nineteen "};
    private static final String[] TENS = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ",
            "Ninety "};
    private static final String[] THOUSANDS = {"", "Thousand ", "Million ", "Billion "};
    private static final String HUNDRED = "Hundred ";

    public static String formatInteger(int num) {
        if (num == 0)
            return "Zero";
        StringBuilder words = new StringBuilder();
        List<Integer> ints = getIntGroup(num);
        for (int i = 0; i < ints.size(); i++) {
            String smallNumber = smallNumberToWords(ints.get(i));
            if (!smallNumber.isEmpty()) {
                words.insert(0, smallNumber + THOUSANDS[i]);
            }
        }

        return words.substring(0, words.length() - 1);
    }

    /**
     * 将数字每三位分组
     * @param num
     * @return
     */
    private static List<Integer> getIntGroup(int num) {
        List<Integer> ints = new ArrayList<>();
        while (num / 1000 > 0) {
            ints.add(num % 1000);
            num = num / 1000;
        }
        ints.add(num);
        return ints;
    }

    /**
     * 将三位数数字转成words
     * @param num 三位数一下（包含）数字
     * @return
     */
    private static String smallNumberToWords(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return LESS_THAN_20[num];
        } else if (num < 100) {
            return TENS[num / 10] + smallNumberToWords(num % 10);
        } else {
            return LESS_THAN_20[num / 100] + HUNDRED + smallNumberToWords(num % 100);
        }
    }
}
