package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-03-01 23:03
 */
public class Q5035 {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int[] joseph(int n, int m) {
        //构建循环链表
        int[] res = new int[n];
        ListNode head = new ListNode(1, null);
        ListNode tail = head;
        for (int i = 2; i <= n; ++i) {
            tail.next = new ListNode(i, null);
            tail = tail.next;
        }
        tail.next = head;

        //约瑟夫环出圈
        int i = 0;
        int count = 1;
        ListNode prev = tail;
        ListNode p = head;
        while (prev != p) {
            if (count == m) {
                res[i] = p.val;
                prev.next = p.next;
                p = p.next;
                i++;
                count = 1;
            } else {
                prev = p;
                p = p.next;
                count++;
            }
        }
        res[i] = p.val;
        return res;
    }
}
