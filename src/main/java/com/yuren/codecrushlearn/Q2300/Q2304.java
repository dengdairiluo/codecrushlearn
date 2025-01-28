package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-28 23:58
 */
public class Q2304 {
    public ListNode rotate(ListNode head, int k) {
        int size = size(head);
        int effectiveK = k % size;
        if (effectiveK == 0) {
            return head;
        }
        ListNode f = head;
        ListNode b = head;
        while (effectiveK-- > 0) {
            f = f.next;
        }
        while (f.next != null) {
            b = b.next;
            f = f.next;
        }
        ListNode newHead = b.next;
        b.next = null;
        f.next = head;
        return newHead;
    }

    private int size(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }
}
