package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-03-16 23:59
 */
public class Q5093 {
    private final int[] data;
    private final int queueSize;
    private final int[] base;
    private final int[] head;
    private final int[] tail;

    public Q5093(int queueSize) {
        this.queueSize = queueSize + 1; //空出一个位置
        this.data = new int[3 * this.queueSize];

        this.base = new int[3];
        this.head = new int[3];
        this.tail = new int[3];
        for (int i = 0; i < 3; ++i) {
            this.base[i] = this.queueSize * i;
            this.head[i] = this.queueSize * i;
            this.tail[i] = this.queueSize * i;
        }
    }

    public boolean enqueue(int queueID, int value) {
        if ((this.tail[queueID] + 1) % this.queueSize == this.head[queueID] % this.queueSize) {
            return false;
        }

        this.data[this.tail[queueID]] = value;
        this.tail[queueID] = (this.tail[queueID] + 1) % this.queueSize + this.base[queueID];
        return true;
    }

    public int dequeue(int queueID) {
        if (this.tail[queueID] == this.head[queueID]) return -1;
        int ret = this.data[this.head[queueID]];
        this.head[queueID] = (this.head[queueID] + 1) % this.queueSize + this.base[queueID];
        return ret;
    }

    public boolean isEmpty(int queueID) {
        return this.tail[queueID] == this.head[queueID];
    }
}
