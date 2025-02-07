package io.vels.dsa.binarysearcharray;

public class BinarySearch {

    public static void main(String[] args) {
        invokeBinarySearch(5);
    }

    private static void invokeBinarySearch(int searchValue) {
        int[] inputArr = {1, 2, 3, 4, 5, 6};

        // Find the size of the input
        int inputLength = inputArr.length;

        // Index variables
        int startIdx = 0;
        int endIdx = inputLength - 1;

        // Main Logic
        while (endIdx >= startIdx) {

            // Find the median index
            // Option 1
            // int midIdx = (startIdx + endIdx) / 2;

            // Option 2
            // Overflow prevention:
            // This method avoids potential integer overflow that can occur when adding two large numbers
            int midIdx = startIdx + (endIdx - startIdx) / 2;


            if (inputArr[midIdx] == searchValue) {
                System.out.println("The Search Value " + searchValue + " Found at " + midIdx);
                return;
            } else if (inputArr[midIdx] < searchValue) {
                // Move Right
                startIdx = midIdx + 1;
            } else if (inputArr[midIdx] > searchValue) {
                // Move Left
                endIdx = midIdx - 1;
            }
        }

        System.out.println("Search Value Not Found");

    }

}
