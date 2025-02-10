package io.vels.dsa.hashtable;

public class HashTable {

    int size = 7;
    Node[] dataMap;

    public HashTable() {
        this.dataMap = new Node[size];
    }

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public void printHashTable() {
        for (int i = 0; i < dataMap.length; i++) {

            System.out.println("Index " + i + ":");
            Node temp = dataMap[i];

            // Printing each data map
            while (temp != null) {
                System.out.println("Key :: " + temp.key + " Value :: " + temp.value);
                temp = temp.next;
            }
        }
    }

    private int Hash(String key) {
        char[] keyChars = key.toCharArray();
        int hash = 0;

        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            // Mod by size is to retain the hash value between our size 0 to 6 to allocate data
            hash = (hash + asciiValue * 23) % size;
        }

        return hash;
    }
}
