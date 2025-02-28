package com.yuren.codecrushlearn.Q5000;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 * 单链表实现
 * @author Sleepy Code Tom
 * @date 2025-02-27 00:39
 */
public class Q5034 {
    private ListNode head;
    private int n;

    public Q5034() {
        this.head = new ListNode(-1, null);
        this.n = 0;
    }

    public void add(int value) {
        add(this.n, value);
    }

    public boolean add(int index, int value) {
        if (index < 0 || index > this.n) return false;

        ListNode prev = head;
        int i = 0;
        while (i < index) {
            prev = prev.next;
            i++;
        }
        ListNode tmp = prev.next;
        prev.next = new ListNode(value, tmp);
        this.n++;
        return true;
    }

    public int remove(int index) {
        if (index < 0 || index >= this.n) return -1;

        ListNode prev = head;
        int i = 0;
        while (i < index) {
            prev = prev.next;
            i++;
        }
        int ret = prev.next.val;
        prev.next = prev.next.next;
        this.n--;
        return ret;
    }

    public int get(int index) {
        if (index < 0 || index >= this.n) return -1;

        ListNode p = head.next;
        int i = 0;
        while (i < index) {
            p = p.next;
            i++;
        }
        return p.val;
    }
}
