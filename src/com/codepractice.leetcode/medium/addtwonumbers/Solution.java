package com.codepractice.leetcode.medium.addtwonumbers;

import java.util.Objects;

//not solved
class Solution {

    private char[] firstNumber;
    private char[] secondNumber;
    private char[] sum;
    private StringBuilder builder = new StringBuilder();

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        firstNumber = getNumberAsString(l1).toCharArray();
        secondNumber = getNumberAsString(l2).toCharArray();
        System.out.println(String.valueOf(firstNumber));
        System.out.println(String.valueOf(secondNumber));
        getSum(0, false);
        System.out.println(builder.toString());

        sum = builder.reverse().toString().toCharArray();

        return getListNode(0);
    }

    private void getSum(int i, boolean additionalDigit) {
        boolean firstIsPresent = i < firstNumber.length;
        boolean secondIsPresent = i < secondNumber.length;

        if (!firstIsPresent && !secondIsPresent) {
            if (additionalDigit) {
                builder.append('1');
            }
            return;
        }

        int result = 0;
        if (firstIsPresent) {
            result += Character.getNumericValue(firstNumber[i]);
        }
        if (secondIsPresent) {
            result += Character.getNumericValue(secondNumber[i]);
        }

        if (additionalDigit) {
            ++result;
            additionalDigit = false;
        }

        if (result > 9) {
            result = result - 10;
            additionalDigit = true;
        }

        builder.append(result);
        getSum(++i, additionalDigit);
    }

    private ListNode getListNode(int i) {
        if (i < sum.length) {
            ListNode listNode = new ListNode(Character.getNumericValue(sum[i]));
            listNode.next = getListNode(++i);
            return listNode;
        }
        return null;
    }

    private String getNumberAsString(ListNode node) {
        StringBuilder number = new StringBuilder();

        while (Objects.nonNull(node)) {
            number.insert(0, node.val);
            node = node.next;
        }

        return number.toString();
    }
}