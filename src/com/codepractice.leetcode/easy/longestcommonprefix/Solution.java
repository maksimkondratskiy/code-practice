package com.codepractice.leetcode.easy.longestcommonprefix;

//https://leetcode.com/problems/longest-common-prefix/
//
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
//
//Example 1:
//
//Input: ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//Note:
//
//All given inputs are in lowercase letters a-z.

/**
 * not solved
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minWordLength = findLowerWordLength(strs);
        for (int i = 0; i < minWordLength - 1; i++) {

        }
        return "";
    }

    private int findLowerWordLength(String[] strs) {
        int minWorldLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minWorldLength) {
                minWorldLength = str.length();
            }
        }
        return minWorldLength;
    }
}