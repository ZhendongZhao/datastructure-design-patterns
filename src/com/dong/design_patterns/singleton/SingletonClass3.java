package com.dong.design_patterns.singleton;

/**
 * author zhendong.Z
 * version 2017-04-22 12:34
 */

/**
 * Double-Check单例
 */
public class SingletonClass3 {

    private static SingletonClass3 instance;

    private SingletonClass3() {
    }

    public static SingletonClass3 getInstance() {

        if (instance == null) {//效率问题，只有为空才进入synchronized
            synchronized (SingletonClass3.class) {
                if (instance == null) {//防止出现多个实例
                    instance = new SingletonClass3();
                }
            }
        }
        return instance;
    }
}
