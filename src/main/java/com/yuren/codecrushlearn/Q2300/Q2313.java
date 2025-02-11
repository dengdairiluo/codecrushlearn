package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-11 23:52
 */
public class Q2313 {
    public ListNode reorder(ListNode head) {
        if (head == null || head.next == null
                || head.next.next == null) return head;//长度小于2，不需要重排

        ListNode middle = findMiddle(head);
        ListNode tailPart = reverse(middle.next);
        middle.next = null;
        return jointMerge(head, tailPart);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private ListNode jointMerge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0, head1);
        ListNode p1 = head1, p2 = head2;
        while (p1 != null && p2 != null) {
            //先保存两个节点的下一个节点
            ListNode tmp1 = p1.next;
            ListNode tmp2 = p2.next;
            //交替插入
            p1.next = p2;
            p2.next = tmp1;
            //head指向原本链表的下一个节点
            p1 = tmp1;
            p2 = tmp2;
        }
        return dummy.next;
    }
}
