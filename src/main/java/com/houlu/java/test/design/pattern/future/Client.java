package com.houlu.java.test.design.pattern.future;

/**
 * 类名称: Client <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/6/25 下午4:02
 */
public class Client {

    public Data request() {
        final FutureData futureData = new FutureData();
        new Thread() {
            public void run() {
                RealData realData = new RealData();
                futureData.setRealData(realData);
            }
        }.start();
        return futureData;
    }

    public static void main(String[] args) {
        Client client = new Client();
        Data data = client.request();
        System.out.println("请求完毕");
        System.out.println(data.getResult());
    }
}
