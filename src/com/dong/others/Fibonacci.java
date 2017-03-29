package com.dong.others;

/**
 * author zhendong.Z
 * version 2017-03-29 21:47
 */

/**
 * 斐波那契数列:写一个函数，输入n，求斐波那契数列的第n项。
 */
public class Fibonacci {

    public static long fibonacci(int n) {
        long result = 0;
        long preOne = 0;
        long preTwo = 1;

        if (n == 0) {
            return preOne;
        }
        if (n == 1) {
            return preTwo;
        }
        for (int i = 2; i < n; i++) {
            result = preOne + preTwo;
            preOne = preTwo;
            preTwo = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));
    }

}
