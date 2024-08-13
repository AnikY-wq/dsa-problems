package com.aniket.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }
        int maxCount = 0;
        for (int num : arr) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                // count the length of the sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 104, 200, 1, 3, 2, 102, 103, 101 };
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(arr));
    }

}
