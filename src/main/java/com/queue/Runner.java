package com.queue;

public class Runner {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);

        q.deQueue();
        // q.deQueue();

        q.enQueue(9);
        q.enQueue(1);

        q.enQueue(19);
        q.enQueue(15);
        System.out.println("Size : " + q.getSize());
        System.out.println("isEmpty : " + q.isEmpty());
        System.out.println("isFull : " + q.isFull());
        q.show();
    }
}
