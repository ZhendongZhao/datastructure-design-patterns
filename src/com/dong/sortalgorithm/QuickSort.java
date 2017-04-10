package com.dong.sortalgorithm;

/**
 * author zhendong.Z
 * version 2017-04-10 11:42
 */

/**
 * 快速排序（不稳定的）
 * 思路：冒泡+二分+递归分治
 * 快速排序采用了一种分治的策略，通常称其为分治法，其基本思想是：将原问题分解为若干个规模更小但结构与原问题相似的子问题。递归地解这些子问题，然后将这些子问题的解组合为原问题的解。
 * 快速排序的具体过程如下：
 * 第一步，在待排序的n个记录中任取一个记录，以该记录的排序码为准，将所有记录分成两组，第1组各记录的排序码都小于等于该排序码，第2组各记录的排序码都大于该排序码，并把该记录排在这两组中间。
 * 第二步，采用同样的方法，对左边的组和右边的组进行排序，直到所有记录都排到相应的位置为止。
 */
public class QuickSort {

    //划分
    public static int partition(int[] arr, int left, int right) {
        int pivoKey = arr[left];

        while (left < right) {
            while (left < right && arr[right] >= pivoKey) {
                right--;
                arr[left] = arr[right];//把小的移到左边
            }
            while (left < right && arr[left] <= pivoKey) {
                left++;
                arr[right] = arr[left];//把大的移到右边
            }
        }
        arr[left] = pivoKey;//把pivoKey赋值到中间
        return left;
    }

    //递归划分子序列
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotPos = partition(arr, left, right);
        quickSort(arr, left, pivotPos - 1);
        quickSort(arr, pivotPos + 1, right);
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        quickSort(arr, 0, arr.length - 1);
    }


}
