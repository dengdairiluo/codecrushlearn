package com.yuren.codecrushlearn.Q5000;

import java.util.Stack;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-03-07 00:05
 */
public class Q5063 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] sarr = s.toCharArray();
        for (int i = 0; i < sarr.length; ++i) {
            if (sarr[i] == '(' || sarr[i] == '[' || sarr[i] == '{') {
                stack.push(sarr[i]);
            } else {
                char topValue = stack.pop();
                if ((sarr[i] == ')' && topValue != '(')
                        || (sarr[i] == ']' && topValue != '[')
                        || (sarr[i]) == '}' && topValue != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
