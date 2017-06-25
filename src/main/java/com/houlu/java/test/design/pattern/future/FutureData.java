package com.houlu.java.test.design.pattern.future;

/**
 * 类名称: FutureData <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 17/6/25 下午3:55
 */
public class FutureData implements Data {

    protected RealData realData = null;

    protected boolean isReady = false;


    public synchronized void setRealData(RealData realData){
        if(isReady){
            return;
        }
        this.realData = realData;
        isReady = true;
        notifyAll();
    }

    @Override
    public synchronized String getResult() {
        while (!isReady){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return realData.result;
    }
}
