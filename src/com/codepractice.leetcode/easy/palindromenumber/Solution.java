package com.codepractice.leetcode.easy.palindromenumber;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/palindrome-number/
//
//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//
//Example 1:
//
//Input: 121
//Output: true
//Example 2:
//
//Input: -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//Follow up:
//
//Could you solve it without converting the integer to a string?
class Solution {

    //151 ms
    public boolean isPalindrome1(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        if (x / 10 == 0) {
            return true;
        }

        int digit = x;
        List<Integer> xAsList = new ArrayList<>();
        while (digit != 0) {
            xAsList.add(digit % 10);
            digit = digit / 10;
        }

        for (int i = 0, j = xAsList.size() - 1; i < xAsList.size() / 2; i++, j--) {
            if (!xAsList.get(i).equals(xAsList.get(j))) {
                return false;
            }
        }
        return true;

    }

    //116 ms
    public boolean isPalindrome2(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        if (x / 10 == 0) {
            return true;
        }

        int digit = x;
        int reversed = 0;
        while (digit != 0) {
            reversed = reversed * 10 + (digit % 10);
            digit /= 10;
        }

        return x / reversed == 1;
    }

    //peeped idea of compare part of number
    //94 ms
    public boolean isPalindrome3(int x) {
        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        if (x / 10 == 0) {
            return true;
        }

        int partOfX = x;
        int reversed = 0;
        while (partOfX != 0) {
            reversed = reversed * 10 + (partOfX % 10);
            partOfX /= 10;
            if (reversed == partOfX) return true;
        }

        return x == reversed;
    }
}