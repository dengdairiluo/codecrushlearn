package com.yuren.codecrush.Q0;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author 10204
 * @date 2024-11-20 23:52
 */
public class Q1502 {

//    Queue<Integer> q1;
//    Queue<Integer> q2;
//    Queue<Integer> q3;
//    Queue<Integer> q4;
//    Queue<Integer> q5;

    Queue<Integer>[] queues;

    private int queueLength;

    public Q1502() {
//        q1 = new LinkedList<>();
//        q2 = new LinkedList<>();
//        q3 = new LinkedList<>();
//        q4 = new LinkedList<>();
//        q5 = new LinkedList<>();
        int queueLength = 5;
        queues = new LinkedList[queueLength];
        for (int i = 0; i < queueLength; i++) {
            queues[i] = new LinkedList<>();
        }
    }

    public void joinQueue(int customNo, int priority) {
//        if (priority == 1) {
//            q1.add(customNo);
//        } else if (priority == 2) {
//            q2.add(customNo);
//        } else if (priority == 3) {
//            q3.add(customNo);
//        } else if (priority == 4) {
//            q4.add(customNo);
//        } else {
//            q5.add(customNo);
//        }
        queues[priority].add(customNo);
    }

    public int handleBusiness() {
//        if (!q1.isEmpty()) {
//            return q1.poll();
//        }
//        if (!q2.isEmpty()) {
//            return q2.poll();
//        }
//        if (!q3.isEmpty()) {
//            return q3.poll();
//        }
//        if (!q4.isEmpty()) {
//            return q4.poll();
//        }
//        if (!q5.isEmpty()) {
//            return q5.poll();
//        }
//        return -1;
        for (int i = 0; i < queueLength; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].poll();
            }
        }
        return -1;
    }
}
