package com.company.chars;

/**
 * author zhendong.Z
 * version 2017-03-27 23:00
 */

/**
 * 实现一个函数，把字符串中的每个空格替换成“%20”
 */
public class ReplaceBlank {

    public static String replaceBlank(String input) {
        if (input == null)
            return null;
        StringBuffer outputBuffer = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                outputBuffer.append("%");
                outputBuffer.append("2");
                outputBuffer.append("0");
            } else {
                outputBuffer.append(String.valueOf(input.charAt(i)));
            }
        }
        return new String(outputBuffer);
    }

    public static void main(String args[]) {
        String s = "We are happy.";
        System.out.println(s);
        System.out.println(replaceBlank(s));
    }
}
