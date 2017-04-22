package com.dong.designmode.singleton;

/**
 * author zhendong.Z
 * version 2017-04-22 12:46
 */

/**
 * Effective Java 2 —— 枚举
 * 由于创建枚举实例的过程是线程安全的，所以这种写法也没有同步的问题。
 * 无偿地提供了序列化机制，绝对防止对此实例化，即使是在面对复杂的序列化或者反射攻击的时候。虽然这中方法还没有广泛采用，但是单元素的枚举类型已经成为实现Singleton的最佳方法。
 * 但是在需要继承的场景，它就不适用了。
 */
public enum SingleInstance {
    INSTANCE;

    public void fun1() {
        // do something
    }
}

// 使用时如下，为防止报错暂时先将其注释
//SingleInstance.INSTANCE.fun1();
