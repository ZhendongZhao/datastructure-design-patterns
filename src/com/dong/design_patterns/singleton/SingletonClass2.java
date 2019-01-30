package com.dong.design_patterns.singleton;

/**
 * author zhendong.Z
 * version 2017-03-27 22:47
 */

/**
 * 懒汉式单例模式
 */
public class SingletonClass2 {

    private static SingletonClass2 instance = null;

    private SingletonClass2() {
    }

    private synchronized static SingletonClass2 getInstance() {
        if (instance == null) {
            instance = new SingletonClass2();
        }
        return instance;
    }
}
