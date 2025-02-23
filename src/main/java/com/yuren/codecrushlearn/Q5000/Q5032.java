package com.yuren.codecrushlearn.Q5000;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-22 23:38
 */
public class Q5032 {

    public ListNode insert(ListNode head, int value) {
        if (head == null) {
            return new ListNode(value, null);
        }
        if (value < head.val) {
            return new ListNode(value, head);
        }
        ListNode p = head;
        // 比value小的节点,就跳过
        while (p.next != null && p.val < value && p.next.val < value) {
            p = p.next;
        }
        ListNode tmp = p.next;
        p.next = new ListNode(value, tmp);
        return head;
    }

}
