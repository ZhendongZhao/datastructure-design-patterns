package com.dong.sortalgorithm;

/**
 * author zhendong.Z
 * version 2017-04-10 11:41
 */

/**
 * 简单插入排序
 */
public class InsertSort {

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int target = arr[i];//待插入的

            //后移
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            //插入
            arr[j] = target;
        }

    }
}
