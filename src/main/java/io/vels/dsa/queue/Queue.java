package io.vels.dsa.queue;

import io.vels.dsa.common.Node;

public class Queue {

    Node first;
    Node last;
    int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length = 1;
    }

    public void print() {
        System.out.println("Queue values below : ");
        Node temp = first;

        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    public void getFirst() {
        System.out.println("First : " + first.getValue());
    }

    public void getLast() {
        System.out.println("Last : " + last.getValue());
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        // When the queue is empty
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }

        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return null;
        }

        // If single item in the queue
        Node removedNode = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            // Move the pointer to the next node
            first = first.getNext();
            // detaching from the queue
            removedNode.setNext(null);
        }

        length--;

        return removedNode;
    }
}
