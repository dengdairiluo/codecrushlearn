package com.yuren.codecrushlearn.Q5000;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 * 链式栈
 * @author Sleepy Code Tom
 * @date 2025-03-04 23:55
 */
public class Q5062 {
    private ListNode head = null;

    public void push(int value) {
        ListNode node = new ListNode(value, this.head);
        this.head = node;
    }

    public int pop() {
        if (this.head == null) return -1;
        int ret = this.head.val;
        this.head = this.head.next;
        return ret;
    }

    public int peek() {
        if (this.head == null) return -1;
        return this.head.val;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

}
