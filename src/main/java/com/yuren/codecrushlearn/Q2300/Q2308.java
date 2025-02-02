package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-03 00:00
 */
public class Q2308 {
    public ListNode segmentReverse(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1) return head;

        ListNode start = head;
        ListNode end = head;
        for (int i = 0; i < k && end != null; i++) {
            end = end.next;
        }
        // 翻转当前的start到end范围所有的节点
        ListNode newHead = reverse(start, end);
        //递归翻转下一组 k个节点
        head.next = segmentReverse(end, k);
        return newHead;
    }

    private ListNode reverse(ListNode start, ListNode end) {
        ListNode pre, cur, next;
        cur = start;
        pre = null;
        while (cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
