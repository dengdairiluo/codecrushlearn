package com.yuren.codecrushlearn.Q5000;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-24 23:39
 */
public class Q5033 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode newHead = new ListNode();
        ListNode tail = newHead;
        ListNode p = head;
        while (p != null) {
            ListNode tmp = p.next;
            if (p.val != val) {
                p.next = null;
                tail.next = p;
                tail = p;
            }
            p = tmp;
        }
        return newHead.next;
    }
}
