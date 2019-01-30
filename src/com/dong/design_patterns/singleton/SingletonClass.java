package com.dong.design_patterns.singleton;

/**
 * author zhendong.Z
 * version 2017-03-27 22:44
 * <p>
 * 设计实现单例模式
 */
/**
 * 设计实现单例模式
 */

/**
 * 饿汉式单例模式
 */
public class SingletonClass {

    private static final SingletonClass instance = new SingletonClass();

    //私有构造函数
    private SingletonClass() {
    }

    public static SingletonClass getInstance() {

        return instance;
    }

}




