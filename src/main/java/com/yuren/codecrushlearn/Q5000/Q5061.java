package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-03-03 01:26
 */
public class Q5061 {
    private int[] data;
    private int n;
    private int top;

    public Q5061(int stackSize) {
        this.data = new int[stackSize];
        this.n = stackSize;
        this.top = 0;
    }

    public boolean push(int value) {
        if (this.top >= this.n) return false;
        this.data[this.top] = value;
        this.top++;
        return true;
    }

    public int pop() {
        if (this.top == 0) return -1;
        this.top--;
        return this.data[this.top];
    }

    public int peek() {
        if (this.top == 0) return -1;
        return this.data[this.top - 1];
    }

    public boolean isEmpty() {
        return this.top == 0;
    }
}
