package com.codepractice.leetcode.reverseinteger;

//Given a 32-bit signed integer, reverse digits of an integer.
//
//Example 1:
//
//Input: 123
//Output: 321
//Example 2:
//
//Input: -123
//Output: -321
//Example 3:
//
//Input: 120
//Output: 21
//Note:
//Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
//For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
public class Solution {

    public int reverse(int x) {
        String reversed = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();

        try {
            int result = Integer.parseInt(reversed);
            return x >= 0 ? result : -result;
        } catch (Exception e) {
            return 0;
        }
    }
}
