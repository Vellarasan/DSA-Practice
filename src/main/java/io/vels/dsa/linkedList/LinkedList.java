package io.vels.dsa.linkedList;

import io.vels.dsa.common.Node;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void PrintLinkedList() {
        Node tempNode = head;
        while (tempNode.getNext() != null) {
            System.out.println(length + " == " + tempNode.getValue());
            tempNode = head.getNext();
        }
    }

}
