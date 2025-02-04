package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-04 23:20
 */
public class Q2309 {
    public boolean palindrome(ListNode head){
        // 找到中间节点（偶数节点则是靠前的节点）
        ListNode middle = findMiddle(head);
        ListNode tailPart = reverse(middle.next);
        middle.next = null;
        while (tailPart!=null){
            if (head.val != tailPart.val){
                return false;
            }
            head = head.next;
            tailPart = tailPart.next;
        }
        return true;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        // 这样设置fast，在偶数场景下找出的middle 是中间靠前的节点， 奇数场景恰好是中间节点，方便后续的reverse操作
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head){
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
}
