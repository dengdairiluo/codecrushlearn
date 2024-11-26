package com.yuren.codecrushlearn.Q0;

import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2024-11-25 23:42
 */
public class Q1506 {
    private static String solveEquation(String equation) {
        // 一元一次方程，可以转化为kx + b = 0 的形式，因此x = -(b/k)
        // 根据=把方程分割为左右两个部分
        String[] parts = equation.split("=");
        String left = parts[0];
        System.out.println("left: " + left);
        String right = parts[1];
        System.out.println("right: " + right);

        // 合并同类项，返回[k, b]
        int[] leftResult = simplifyExpression(left);
        System.out.println("leftResult: " + Arrays.toString(leftResult));
        int[] rightResult = simplifyExpression(right);
        System.out.println("rightResult: " + Arrays.toString(rightResult));

        // Calculate k and b for the equation kx + b = 0
        int k = leftResult[0] - rightResult[0]; // k = 左半边的k - 右半边的k
        int b = leftResult[1] - rightResult[1] ; // b = 左半边的b - 右半边的b

        // x = - b / k
        double x = -1.0 * b / k;
        return String.format("%.3f", x);
    }


    private static int[] simplifyExpression(String expression) {
        int[] result = new int[2]; // [k,b]
        int sign = 1; //当前的正负号， 1 表示正，-1表示负
        int i = 0;
        int n = expression.length();

        while (i < n) {
            if (expression.charAt(i) == '+') {
                sign = 1;
                i++;
            } else if (expression.charAt(i) == '-') {
                sign = -1;
                i++;
            } else {
                int coef = 0;
                boolean hasX = false;

                while (i < n && Character.isDigit(expression.charAt(i))) {
                    coef = coef * 10 + (expression.charAt(i) - '0');
                    i++;
                }

                if (i < n && expression.charAt(i) >= 'a' && expression.charAt(i) <= 'z') {// 包含未知数
                    hasX = true;
                    i++;
                }

                if (coef == 0 && hasX) {
                    coef = 1;
                }

                if (hasX) {
                    result[0] += sign * coef;//有未知数，则k增加
                } else {
                    result[1] += sign * coef;//没有未知数，则b增加
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solveEquation("4+3x=8"));
    }
}
