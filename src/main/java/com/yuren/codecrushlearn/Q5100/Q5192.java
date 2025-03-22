package com.yuren.codecrushlearn.Q5100;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-03-20 23:29
 */
public class Q5192 {

    private int[] mem;

    public int fibonacci(int n) {
        // 记忆化求斐波那契数列
        mem = new int[n+1];
        return fibonacci_recur(n);
    }

    private int fibonacci_recur(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (mem[n] != 0) return mem[n];
        mem[n] = (fibonacci_recur(n-1) + fibonacci_recur(n-2))%1000000007;
        return mem[n];
    }
}
