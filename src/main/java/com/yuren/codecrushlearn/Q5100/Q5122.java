package com.yuren.codecrushlearn.Q5100;

/**
 * Created with Intellij IDEA.
 * Description:
 * 递归算阶乘
 * @author Sleepy Code Tom
 * @date 2025-03-23 23:33
 */
public class Q5122 {
    public int factorial(int n) {
        if (n == 1) return 1;
        return (n * factorial(n - 1)) % 7777777;
    }
}
