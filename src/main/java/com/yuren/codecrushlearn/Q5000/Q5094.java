package com.yuren.codecrushlearn.Q5000;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author Sleepy Code Tom
 * @date 2025-03-19 00:06
 */
public class Q5094 {
    private static class Animal {
        public int id;
        public int seq;

        public Animal(int id, int seq) {
            this.id = id;
            this.seq = seq;
        }
    }

    private static class ListNode {
        public Animal val;
        private ListNode next;

        public ListNode() {
        }

        public ListNode(Animal val) {
            this.val = val;
        }

        public ListNode(Animal val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static class AnimalQueue {
        private ListNode head;
        private ListNode tail;

        public void enqueue(Animal value) {
            if (tail == null) {
                ListNode newNode = new ListNode(value, null);
                head = newNode;
                tail = newNode;
            } else {
                tail.next = new ListNode(value, null);
                tail = tail.next;
            }
        }

        public Animal dequeue() {
            if (head == null) return null;

            Animal value = head.val;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return value;
        }

        public Animal peek() {
            if (head == null) return null;
            return head.val;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    private AnimalQueue dogQueue = new AnimalQueue();
    private AnimalQueue catQueue = new AnimalQueue();
    private int seq = 0;
    private int animalNum = 0;
    private int shelfSize;

    public Q5094(int shelfSize) {
        this.shelfSize = shelfSize;
    }

    public boolean enqueueDog(int dogID) {
        if (this.animalNum == this.shelfSize) return false;
        this.dogQueue.enqueue(new Animal(dogID, this.seq));
        this.seq++;
        this.animalNum++;
        return true;
    }

    public boolean enqueueCat(int catID) {
        if (this.animalNum == this.shelfSize) return false;
        this.catQueue.enqueue(new Animal(catID, this.seq));
        this.seq++;
        this.animalNum++;
        return true;
    }

    public int dequeueAny() {
        if (this.animalNum == 0) return -1;

        Animal dog = this.dogQueue.peek();
        Animal cat = this.catQueue.peek();
        if (dog == null) {
            this.catQueue.dequeue();
            this.animalNum--;
            return cat.id;
        }
        if (cat == null) {
            this.dogQueue.dequeue();
            this.animalNum--;
            return dog.id;
        }
        if (dog.seq < cat.seq) {
            this.dogQueue.dequeue();
            this.animalNum--;
            return dog.id;
        } else {
            this.catQueue.dequeue();
            this.animalNum--;
            return cat.id;
        }
    }

    public int dequeueDog() {
        if (this.dogQueue.isEmpty()) return -1;
        this.animalNum--;
        return this.dogQueue.dequeue().id;
    }

    public int dequeueCat() {
        if (this.catQueue.isEmpty()) return -1;
        this.animalNum--;
        return this.catQueue.dequeue().id;
    }
}
