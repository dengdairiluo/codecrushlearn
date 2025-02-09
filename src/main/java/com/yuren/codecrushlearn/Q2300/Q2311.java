package com.yuren.codecrushlearn.Q2300;

import com.yuren.codecrushlearn.entities.ListNode;

import java.util.List;


/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-08 06:38
 */
public class Q2311 {
    public ListNode mergeKLists(List<ListNode> klists, int k) {
        // 使用归并的方式
        return mergeKLists(klists, 0, k - 1);
    }

    /**
     * 归并合并链表
     *
     * @param klists
     * @param left
     * @param right
     * @return
     */
    private ListNode mergeKLists(List<ListNode> klists, int left, int right) {
        if (left == right) {
            return klists.get(left);
        }
        //找出中间位置
        int mid = (left + right) / 2;
        //归并合并左边
        ListNode l1 = mergeKLists(klists, left, mid);
        //归并合并右边
        ListNode l2 = mergeKLists(klists, mid + 1, right);
        //合并最后两个
        return mergeTwoLists(l1, l2);
    }

    /**
     * 合并两个链表
     * @param l1
     * @param l2
     * @return
     */
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //有一个为空，返回另一个
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        //头节点更小的 作为新链表的的头结点，并继续归并，直到有一个链表被完全合并
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}
