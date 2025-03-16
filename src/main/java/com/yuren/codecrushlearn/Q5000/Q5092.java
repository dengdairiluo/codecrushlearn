package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 * 循环队列
 * @author Sleepy Code Tom
 * @date 2025-03-15 23:52
 */
public class Q5092 {
    private final int[] items;
    private final int queueSize;
    private int head = 0;
    private int tail = 0;

    public Q5092(int queueSize) {
        this.items = new int[queueSize + 1];
        this.queueSize = queueSize + 1;
    }

    /**
     * 入队
     * @param item
     * @return
     */
    public boolean enqueue(int item) {
        if ((tail + 1) % queueSize == head) return false;
        items[tail] = item;
        tail = (tail + 1) % queueSize;
        return true;
    }

    /**
     * 出队
     * @return
     */
    public int dequeue() {
        if (head == tail) return -1;
        int ret = items[head];
        head = (head + 1) % queueSize;
        return ret;
    }

    public boolean isEmpty() {
        return head == tail;
    }
}
