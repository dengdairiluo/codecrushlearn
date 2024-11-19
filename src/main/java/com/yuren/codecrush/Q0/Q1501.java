package com.yuren.codecrush.Q0;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author 10204
 * @date 2024-11-19 23:55
 */
public class Q1501 {
    private static int getDifference(int n) {
        int j = 0;
        int o = 0;

        int jP = 1;
        int oP = 1;


        int l = 1;
        while (n > 0) {
            int lstN = n % 10;
//            System.out.println(lstN);
            if (lstN % 2 == 1) {
                j += lstN * jP;
                jP *= 10;
            } else {
                o += lstN * oP;
                oP *= 10;
            }
//            System.out.println(j + " " + o);

            n /= 10;
        }

        return Math.abs(j - o);
    }

    public static void main(String[] args) {
        int q = 302938;
        System.out.println(getDifference(q));
    }
}
