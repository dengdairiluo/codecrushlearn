package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-31 03:04
 */
public class Q2305 {

    public ListNode removeDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // 相邻节点值不同的话，加入链表
            if (curr.val != prev.val) {
                prev.next = curr;
                prev = curr;
            }
            ListNode next = curr.next;
            curr.next = null;
            curr = next;
        }
        return dummy.next;
    }
}
