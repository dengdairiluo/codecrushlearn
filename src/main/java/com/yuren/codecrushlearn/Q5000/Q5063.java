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
            // 左括号入栈
            if (sarr[i] == '(' || sarr[i] == '[' || sarr[i] == '{') {
                stack.push(sarr[i]);
            } else {
                // 右括号出栈
                char topValue = stack.pop();
                // 不匹配返回false
                if ((sarr[i] == ')' && topValue != '(')
                        || (sarr[i] == ']' && topValue != '[')
                        || (sarr[i]) == '}' && topValue != '{') {
                    return false;
                }
            }
        }
        // 是否全部匹配
        return stack.isEmpty();
    }
}
