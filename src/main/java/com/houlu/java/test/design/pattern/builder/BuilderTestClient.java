package com.houlu.java.test.design.pattern.builder;

/**
 * 类名称: BuilderTestClient <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/3/20 下午11:05
 */
public class BuilderTestClient {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder builder =
                new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
        InsuranceContract contract = builder.setCompanyName("").setOtherData("2019").setPersonName("lu.hou").build();

        System.out.println(builder);
    }
}
