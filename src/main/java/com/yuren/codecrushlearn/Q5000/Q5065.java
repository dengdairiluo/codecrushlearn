package com.yuren.codecrushlearn.Q5000;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with Intellij IDEA.
 * Description:
 * 设想有一堆盘子，堆太高可能会倒下来。因此，在现实生活中，盘子堆到一定高度时，就会另外堆一堆盘子。请实现数据结构 SetOfStacks ，模拟这种行为。
 * SetStacks 由多个栈组成，并且在前一个栈填满时，新建一个栈。此外，SetOfStacks.push()、SetOfStacks.pop()、SetOfStacks.peek()、
 * SetOfStacks.isEmpty() 应该与普通栈的操作方法相同。SetOfStacks 的构造函数的参数 sizePerStack 表示每个栈的大小。
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
