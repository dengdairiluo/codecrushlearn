package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-06 06:28
 */
public class Q2310 {
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode virtualHead = new ListNode();//虚拟头节点
        ListNode tail = virtualHead;

        // 两个链表都不为空时，取较小的节点
        while (l1 != null && l2 != null) {
            //把较小的节点拼接到尾部
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        //如果还有剩余部分，直接拼接到最后
        if (l1 != null) {
            tail.next = l1;
        } else if (l2 != null) {
            tail.next = l2;
        }
        return virtualHead.next;
    }
}
