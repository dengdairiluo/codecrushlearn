package com.yuren.codecrushlearn.Q5000;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-03-13 01:12
 */
public class Q5066 {
    private ListNode head = null;
    private ListNode tail = null;

    public void enqueue(int value) {
        if (tail == null) {
            ListNode newNode = new ListNode(value, null);
            head = newNode;
            tail = newNode;
        } else {
            tail.next = new ListNode(value, null);
            tail = tail.next;
        }
    }

    public int dequeue() {
        if (head == null) return -1;

        int value = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
