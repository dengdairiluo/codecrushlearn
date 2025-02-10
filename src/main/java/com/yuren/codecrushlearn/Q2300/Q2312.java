package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-10 07:16
 */
public class Q2312 {
    public ListNode swap(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;

        // 每次交换两个节点
        while (temp.next != null && temp.next.next != null) {
            // 需要交换位置的两个节点
            ListNode first = temp.next;
            ListNode second = first.next;
            // 第一个节点指向第二个节点的后继
            first.next = second.next;
            temp.next = second;
            second.next = first;
            temp = first;
        }
        return dummy.next;
    }
}
