package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description: 1503 注解版
 *
 * @author Sleepy Code Tom
 * @date 2024-11-21 23:38
 */
public class Q1503 {
    private static String constructPalindrome(String s, int k) {
//        System.out.println("s.length = " + s.length());
        int diff = s.length() - k;
//        System.out.println("diff = " + diff);
        if (diff == 0) {
            return new StringBuilder(s).reverse().toString();
        }
        if (isPalindrome(s.substring(s.length() - diff, s.length()))) {
            // 字符串s diff + 1 到 s.length 是回文。 在尾巴上接k个跟头k个对称
            return new StringBuilder().append(s, 0, k).reverse().toString();
        }
        if (isPalindrome(s.substring(0, diff))) {
            // 字符串s 0 到 diff 是回文,在头上接k个跟尾k个对称
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
        // 官方样例不好理解，这4个会典型些
        System.out.println(constructPalindrome("abccc", 2));
        System.out.println(constructPalindrome("abccc", 3));
        System.out.println(constructPalindrome("cccba", 2));
        System.out.println(constructPalindrome("cccba", 3));
    }
}
