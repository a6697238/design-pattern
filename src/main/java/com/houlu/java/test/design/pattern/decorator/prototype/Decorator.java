package com.houlu.java.test.design.pattern.decorator.prototype;

/**
 * 类名称: Decorator <br>
 * 类描述: <br>
 *
 *
 * 装饰者类
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 16/9/20 上午12:21
 */
public class Decorator implements Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }


    public void sampleOperation() {
        // 委派给构件
        component.sampleOperation();
    }
}