package io.vels.dsa.queue;

import io.vels.dsa.common.Node;

public class Main {
    public static void main(String[] args) {


        Queue queue = new Queue(10);

        // Enqueue
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);


        // Dequeue
        queue.dequeue();
        queue.dequeue();

        // Printing the queue
        queue.print();

    }
}
