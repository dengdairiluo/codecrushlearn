package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-01-26 23:52
 */
public class Q2303 {

    /**
     * 快慢指针删除倒数第K个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode removeLastKth(ListNode head, int k) {
        ListNode h = new ListNode(0,head);
        ListNode f = h;
        ListNode b = h;

        while(k-- > 0){
            f = f.next;
        }
        while(f.next != null){
            f = f.next;
            b = b.next;
        }
        b.next = b.next.next;
        return h.next;
    }
}
