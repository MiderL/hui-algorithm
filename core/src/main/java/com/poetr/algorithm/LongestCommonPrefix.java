package com.poetr.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * leetcode 14 最长公共前缀
 *
 * @author poetr
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // 字符串数组长度为0时直接返回空串
        if (strs.length == 0) return "";

        // 按照字符串长度排序，以最短字符串作为基准
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String ans = strs[0];
        // 遍历第一个基准元素之外的字符串，与基准字符串进行比较，截取公共前缀
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < ans.length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) break;
            }
            ans = ans.substring(0, j);
            if (ans.length() == 0) return "";
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] test = {"flow", "floabc", "flabc"};
        String res = longestCommonPrefix(test);
        System.out.println(res);
    }

}
