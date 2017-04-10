package com.dong.sortalgorithm;

/**
 * author zhendong.Z
 * version 2017-04-10 11:29
 */

/**
 * 选择排序
 * 思路：在一次排序后把最小的元素放在最前面，对整体进行选择，例：4,3,8,6,9首先要选择4以外的最小数来和4交换，也就是3，4进行选择和交换
 */
public class SelectSort {

    public static void selectSort(int[] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }
        int minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {//只需要比较n-1次
            minIndex = 1;
            for (int j = i + 1; j < arr.length; j++) {//从i+1开始比较，因为minIndex默认为i了，i就没必要比了
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {//如果minIndex不为1，说明找到了更小的值，交换之
                swap(arr, i, minIndex);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
