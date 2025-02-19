package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-02-18 23:32
 */
public class Q5003 {
    private int[] data;
    private int capacity;
    private int n; //元素个数

    public Q5003() {
        this.capacity = 4;
        this.data = new int[this.capacity];
        this.n = 0;
    }

    /**
     *  在数组中插入一个元素,可扩容
     * @param index
     * @param value
     * @return
     */
    public boolean insert(int index, int value) {
        if (index > n || index < 0) return false;
        if (capacity == n) {
            int[] newData = new int[capacity * 2];
            for (int i = 0; i < n; ++i) {
                newData[i] = this.data[i];
            }
            this.capacity *= 2;
            this.data = newData;
        }
        for (int i = n - 1; i >= index; --i) {
            this.data[i + 1] = this.data[i];
        }
        this.data[index] = value;
        this.n++;
        return true;
    }

    public int deleteElem(int index) {
        if (index < 0 || index >= this.n) return -1;
        int value = this.data[index];
        for (int i = index + 1; i < n; ++i) {
            this.data[i - 1] = this.data[i];
        }
        this.n--;
        return value;
    }

    public int get(int index) {
        if (index < 0 || index >= this.n) return -1;
        return this.data[index];
    }
}
