package com.yuren.codecrushlearn.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-11-27 23:57
 */
public class Q1507 {
    private static int findNthTerm(int k, int n) {
        int res = 0;
        int base = 1;// k的0次方

        while (n > 0) {// 这个循环将会对 n 的每一位（以二进制表示）进行处理。例如 100 的二进制位 1100100 ，再把该数字当做三进制处理，得出对应的10进制的值: 3^6+3^5+3^2
            if ((n & 1) == 1) {// 使用按位 与 操作符 & 来检查 n 的二进制最低位是否为 1。若为 1，则将 base 的当前值加到 res 上。
                res += base;
            }
            System.out.println("base=" + base + " n=" + n + " k=" + k + " res=" + res);
            base *= k;  // 更新基数为k的幂次 k^0, k^1, k^2,依次类推
            n >>= 1;    // 右移一位处理下一位
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(findNthTerm(3, 0));
//        System.out.println(findNthTerm(3, 1));
        System.out.println(findNthTerm(3, 12));
    }
}
