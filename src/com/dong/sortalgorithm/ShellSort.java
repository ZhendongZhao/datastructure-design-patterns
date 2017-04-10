package com.dong.sortalgorithm;

/**
 * author zhendong.Z
 * version 2017-04-10 11:44
 */

/**
 * 希尔排序
 */
public class ShellSort {

    public static void shellInsert(int[] arr, int increment) {

        for (int i = increment; i < arr.length; i++) {
            int j = i - increment;
            int temp = arr[i];//记录要插入的数据
            while (j >= 0 && arr[j] > temp) {//从后向前，找到比其小的数的位置
                arr[j + increment] = arr[j];//向后挪动
                j -= increment;
            }

            if (j != i - increment) {//存在比其小的数
                arr[j + increment] = temp;
            }
        }
    }

    public static void shellSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int increment = arr.length / 2;
        while (increment >= 1) {
            shellInsert(arr, increment);
            increment /= 2;
        }
    }
}
