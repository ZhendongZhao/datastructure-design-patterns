package com.dong.designmode.singleton;

/**
 * author zhendong.Z
 * version 2017-04-22 12:44
 */

/**
 * Effective Java 1 —— 静态内部类
 * 对于内部类SingletonHolder，它是一个饿汉式的单例实现，在SingletonHolder初始化的时候会由ClassLoader来保证同步，使INSTANCE是一个真·单例。
 * 同时，由于SingletonHolder是一个内部类，只在外部类的Singleton的getInstance()中被使用，所以它被加载的时机也就是在getInstance()方法第一次被调用的时候。
 * —它利用了ClassLoader来保证了同步，同时又能让开发者控制类加载的时机。从内部看是一个饿汉式的单例，但是从外部看来，又的确是懒汉式的实现。
 */
public class SingletonClass5 {

    private static class SingletonHolder {
        private static final SingletonClass5 INSTANCE = new SingletonClass5();
    }

    private SingletonClass5() {
    }

    public static final SingletonClass5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
