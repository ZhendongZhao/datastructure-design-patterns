package com.dong.sortalgorithm;

/**
 * author zhendong.Z
 * version 2017-04-10 11:44
 */

/**
 * 归并排序
 */
public class MergeSort {

    public static void mergeSort(int[] arr) {

    }

    /**
     * 递归分治
     */
    public static void mSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;

        mSort(arr, left, mid);
        mSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    /**
     * 合并两个有序数组
     */
    public static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];//中间数组

        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }
}
