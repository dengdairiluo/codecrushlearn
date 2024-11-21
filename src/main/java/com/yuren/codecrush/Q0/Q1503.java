package com.yuren.codecrush.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author 10204
 * @date 2024-11-21 23:38
 */
public class Q1503 {
    private static String constructPalindrome(String s, int k) {
        int diff = s.length() - k;
        if (diff == 0) {
            return new StringBuilder(s).reverse().toString();
        }
        if (isPalindrome(s.substring(s.length() - diff, s.length()))) {
            return new StringBuilder().append(s, 0, k).reverse().toString();
        }
        if (isPalindrome(s.substring(0, diff))) {
            return new StringBuilder().append(s, s.length() - k, s.length()).reverse().toString();
        }
        return null;
    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(constructPalindrome("bab", 2));
    }
}
