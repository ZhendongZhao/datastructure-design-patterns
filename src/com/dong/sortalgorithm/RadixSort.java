package com.dong.sortalgorithm;

/**
 * author zhendong.Z
 * version 2017-04-11 13:51
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 基数排序算法
 */
public class RadixSort {

    public static void radixSort(int[] arr) {
        if (arr == null && arr.length == 0) {
            return;
        }

        int maxBit = getMaxBit(arr);

        for (int i = 1; i <= maxBit; i++) {
            List<List<Integer>> buf = distribute(arr, i);//分配
            collecte(arr, buf);//收集
        }
    }

    /**
     * 待分配的数组
     */
    public static List<List<Integer>> distribute(int[] arr, int iBit) {
        List<List<Integer>> buf = new ArrayList<List<Integer>>();

        for (int j = 0; j < 10; j++) {
            buf.add(new LinkedList<Integer>());
        }
        for (int i = 0; i < arr.length; i++) {
            buf.get(getNBit(arr[i], iBit)).add(arr[i]);
        }
        return buf;
    }

    /**
     * 把分配的数据收集到arr中
     */
    public static void collecte(int[] arr, List<List<Integer>> buf) {

        int k = 0;
        for (List<Integer> bucket : buf) {
            for (int ele : bucket) {
                arr[k++] = ele;
            }
        }
    }

    /**
     * 获取最大位数
     */
    public static int getMaxBit(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            int len = (ele + "").length();
            if (len > max)
                max = len;
        }
        return max;
    }

    /**
     * 获取x的第n位，否则返回0
     */
    public static int getNBit(int x, int n) {
        String sx = x + "";
        if (sx.length() < n) {
            return 0;
        } else {
            return sx.charAt(sx.length() - n) - '0';
        }

    }

}
