package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-03-09 23:24
 */
public class Q5064 {
    private final int stackSize;
    private final int[] data;
    private final int[] tops;
    private final int[] counts;

    public Q5064(int stackSize) {
        data = new int[3 * stackSize];
        this.stackSize = stackSize;
        tops = new int[3];
        counts = new int[3];

        tops[0] = 0;
        counts[0] = 0;

        tops[1] = stackSize;
        counts[1] = 0;

        tops[2] = 2 * stackSize;
        counts[2] = 0;
    }

    public boolean push(int stackID, int value) {
        if (counts[stackID] >= stackSize) return false;
        data[tops[stackID]] = value;
        tops[stackID]++;
        counts[stackID]++;
        return true;
    }

    public int pop(int stackID) {
        if (counts[stackID] <= 0) {
            return -1;
        }
        tops[stackID]--;
        int ret = data[tops[stackID]];
        counts[stackID]--;
        return ret;
    }

    public int peek(int stackID) {
        if (counts[stackID] <= 0) {
            return -1;
        }
        return data[tops[stackID] - 1];
    }

    public boolean isEmpty(int stackID) {
        return counts[stackID] <= 0;
    }
}
