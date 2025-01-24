package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-25 00:09
 */
public class Q2302 {

    public ListNode findLastKth(ListNode head, int k) {
        ListNode f = head;
        ListNode b = head;
        while (k-- > 0) {
            f = f.next;
        }
        while (f != null) {
            f = f.next;
            b = b.next;
        }
        return b;
    }
}
