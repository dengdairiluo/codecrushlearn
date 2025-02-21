package com.yuren.codecrushlearn.Q5000;

import com.yuren.codecrushlearn.entities.ListNode;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-20 22:57
 */
public class Q5031 {

    public ListNode insertAtHead(ListNode head, int value) {
        return new ListNode(value, head);
    }

    public ListNode insertAtTail(ListNode head, int value) {
        if (head == null) {
            return new ListNode(value, null);
        }
        ListNode p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new ListNode(value, null);
        return head;
    }

    public int size(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            count++;
        }
        return count;
    }

    public ListNode prev(ListNode head, ListNode enode) {
        if (head == null || enode == null) return null;
        if (enode == head) {
            return null;
        }
        ListNode prev = head;
        while (prev.next != null && prev.next != enode) {
            prev = prev.next;
        }
        if (prev.next == null) {
            return null;
        } else {
            return prev;
        }
    }

    public ListNode delete(ListNode head, ListNode enode) {
        if (head == null || enode == null) return head;
        if (enode == head) {
            return head.next;
        }
        ListNode prev = head;
        ListNode p = head.next;
        while (p != null && p != enode) {
            prev = p;
            p = p.next;
        }
        if (p == null) return head;
        prev.next = p.next;
        return head;
    }
}
