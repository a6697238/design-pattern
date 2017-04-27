package com.houlu.java.test.design.pattern.singleton;

import sun.misc.SignalHandler;
import sun.security.jca.GetInstance;

/**
 * 类名称: Singleton <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/4/27 下午8:56
 */
public class Singleton {

    private Singleton(){}

    public static  Singleton getSingle(){
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        public static Singleton instance = new Singleton();
    }
}
