package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-01 22:48
 */
public class Q2307 {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            // 保存当前节点的下一个节点
            next = current.next;
            // 将当前节点的 next 指向前一个节点
            current.next = prev;
            // 将 prev 指针前移
            prev = current;
            // 将 current 指针前移
            current = next;
        }
        // 新的头节点是原链表的最后一个节点
        return prev;
    }
}
