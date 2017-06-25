package com.houlu.java.test.design.pattern.future;

/**
 * 类名称: RealData <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/6/25 下午3:55
 */
public class RealData implements Data {

    protected final String result;

    public RealData() {
        StringBuffer sb = new StringBuffer();
        try {
            sb.append("真实数据");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        result = sb.toString();
    }


    @Override
    public String getResult() {
        return result;
    }
}
