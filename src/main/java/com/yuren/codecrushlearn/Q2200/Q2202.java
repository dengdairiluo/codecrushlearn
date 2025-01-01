package com.yuren.codecrushlearn.Q2200;

import java.util.Stack;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-01 23:56
 */
public class Q2202 {

    private static int removeDigits(int num, int k) {
        String strNum = Integer.toString(num);
        Stack<Character> stack = new Stack<>();

        for (char digit : strNum.toCharArray()) {
            // 栈有值，删除数字不到k个，栈顶元素大于当前元素，删除栈顶元素
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // 还没删够K个，从栈顶删除
        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        result.reverse();

        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.length() == 0 ? 0 : Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.println(removeDigits(1542249, 3));
    }
}
