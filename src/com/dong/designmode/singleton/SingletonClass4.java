package com.dong.designmode.singleton;

/**
 * author zhendong.Z
 * version 2017-04-22 12:41
 */

/**
 * 禁止指令重排序的单例，使用volatile关键字
 */
public class SingletonClass4 {

    private static volatile SingletonClass4 instance;

    private SingletonClass4() {
    }

    public static SingletonClass4 getInstance() {

        if (instance == null) {//效率问题，只有为空才进入synchronized
            synchronized (SingletonClass4.class) {
                if (instance == null) {//防止出现多个实例
                    instance = new SingletonClass4();
                }
            }
        }
        return instance;
    }
}
