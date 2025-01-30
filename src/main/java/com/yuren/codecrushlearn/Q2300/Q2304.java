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

        // 快指针快速到最后一个节点
        while (effectiveK-- > 0) {
            f = f.next;
        }

        // 快慢指针一起走，直到快指针到最后一个节点
        while (f.next != null) {
            b = b.next;
            f = f.next;
        }

        // 断开链表，形成新的链表
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
