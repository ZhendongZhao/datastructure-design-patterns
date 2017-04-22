package com.dong.others;

/**
 * author zhendong.Z
 * version 2017-04-16 17:07
 */

/**
 * 字符串反转
 * 1.reverse jdk自带方法
 * 2.reverse2
 */
public class BackStr {

    public static String reverse(String str){
          return new StringBuilder(str).reverse().toString();
      }

    public static String reverse2(String s){
        char ch[] = s.toCharArray();
        int start = 0, end = ch.length-1;
        char temp;
        while(start<end){
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String s1 = String.copyValueOf(ch);
        return s1;
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(reverse(str));
        System.out.println(reverse2(str));
    }
}
