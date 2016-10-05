package com.houlu.java.test.design.pattern.decorator.prototype;

/**
 * 类名称: ConcreteDecoratorA <br>
 * 类描述: <br>
 *
 * 装饰B
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 16/9/20 上午12:24
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {

        super.sampleOperation();
        // 写相关的业务代码
        System.out.println("传外套");
    }

}
