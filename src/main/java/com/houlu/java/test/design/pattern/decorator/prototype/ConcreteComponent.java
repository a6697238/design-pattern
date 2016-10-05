package com.houlu.java.test.design.pattern.decorator.prototype;

/**
 * 类名称: ConcreteComponent <br>
 * 类描述: <br>
 *
 * 具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类。
 *
 * 被装饰基础类
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 16/9/20 上午12:20
 */
public class ConcreteComponent implements Component {
    public void sampleOperation() {
        System.out.println("穿内衣");
    }
}
