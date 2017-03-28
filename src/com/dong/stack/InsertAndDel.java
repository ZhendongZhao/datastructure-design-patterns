package com.dong.stack;

/**
 * author zhendong.Z
 * version 2017-03-28 22:02
 */

import java.util.Stack;

/**
 * 用两个栈实现一个队列，实现对了的两个函数appendTail和deleteHead，分别完成在队列尾插入结点和在队列头部删除结点的功能
 */
public class InsertAndDel<T> {

    private Stack<T> stack1 = new Stack<T>();
    private Stack<T> stack2 = new Stack<T>();

    public void appendTail(T t) {
        stack1.push(t);
    }

    public T deleteHead() throws Exception {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new Exception("队列为空，无法删除");
        }
        return stack2.pop();
    }

    @Override
    public String toString() {//为了方便观察打印结果，选择最原始的toString方法，实际开发中尽量使用lang3包里的toString方法
        final StringBuffer sb = new StringBuffer("InsertAndDel{");
        sb.append("stack1=").append(stack1);
        sb.append(", stack2=").append(stack2);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        InsertAndDel<String> str = new InsertAndDel<>();
        str.appendTail("1");
        str.appendTail("2");
        str.appendTail("3");
        str.deleteHead();
        System.out.println(str);
    }

}
