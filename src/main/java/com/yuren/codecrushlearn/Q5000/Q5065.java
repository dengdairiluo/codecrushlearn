package com.yuren.codecrushlearn.Q5000;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-03-11 00:41
 */
public class Q5065 {
    private final List<Stack<Integer>> stacks = new ArrayList<>();
    private final int sizePerStack;
    private int top;
    private int index;

    public Q5065(int sizePerStack) {
        this.sizePerStack = sizePerStack;
        this.top = 0;
        this.index = 0;
        this.stacks.add(new Stack<>());
    }

    public void push(int value) {
        if (this.top == this.sizePerStack) {
            this.stacks.add(new Stack<>());
            this.index++;
            this.top = 0;
        }
        Stack<Integer> stack = this.stacks.get(this.index);
        stack.push(value);
        this.top++;
    }

    public int pop() {
        if (this.top == 0 && this.index == 0) return -1;
        if (this.top == 0 && this.index > 0) {
            this.stacks.remove(this.index);
            this.index--;
            this.top = this.sizePerStack;
        }
        this.top--;
        return this.stacks.get(this.index).pop();
    }

    public int peek() {
        if (this.top == 0 && this.index == 0) return -1;
        if (this.top == 0 && this.index > 0) {
            this.index--;
            this.top = this.sizePerStack;
        }
        return this.stacks.get(this.index).peek();
    }

    public boolean isEmpty() {
        return this.top == 0 && this.index == 0;
    }
}
