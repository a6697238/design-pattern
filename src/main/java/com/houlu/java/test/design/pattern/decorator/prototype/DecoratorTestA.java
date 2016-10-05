package com.houlu.java.test.design.pattern.decorator.prototype;

/**
 * 类名称: DecoratorTestA <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 16/9/20 上午12:27
 */
public class DecoratorTestA {

    public static void main(String[] args) {
        Component component = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        component.sampleOperation();
    }
}
