package io.vels.dsa.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree");

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);
        bst.insert(27);

        System.out.println("BST Structure:");
        bst.inorderTraversal(bst.root, 0);

        // Check whether the value is in BST
        System.out.println("Is the value 27 present in the BST? " + bst.contains(100));
    }
}
