package io.vels.dsa.binarysearchtree;


public class BinarySearchTree {

    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    void inorderTraversal(Node root, int level) {
        if (root != null) {
            inorderTraversal(root.left, level + 1);
            System.out.println("Level " + level + ": " + root.value);
            inorderTraversal(root.right, level + 1);
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        // loop bst
        // compare each node to move left / right
        // insert to left if it is lower else right
        Node temp = root;

        // Case when we are inserting into an empty BST
        if (root == null) {
            root = newNode;
            return true;
        }

        while (true) {

            // Case when we are trying to insert existing value into the BST
            if (temp.value == newNode.value) {
                return false;
            }

            // Case when we are inserting non-existing value into the BST
            // Check whether to move left?
            if (newNode.value < temp.value) {
                // See whether the left spot is empty? If so insert the new value
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                // If not empty, then move further down to left
                temp = temp.left;
            } else {
                // See whether the right spot is empty? If so insert the new value
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                // If not empty, then move further down to right
                temp = temp.right;
            }
        }
    }

    public boolean contains(int searchValue) {
        Node temp = root;

        while (temp != null) {
            if (searchValue == temp.value) {
                return true;
            }
            // Move left or right
            temp = searchValue < temp.value ? temp.left : temp.right;
        }
        return false;
    }
}
