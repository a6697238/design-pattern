package com.houlu.java.test.design.pattern.decorator.exampleA;

import java.io.*;

/**
 * 类名称: IOstreamTest <br>
 * 类描述: <br>
 *
 * @author lu.hou
 * @version 1.0.0
 * @since 16/9/20 上午12:39
 */
public class IOstreamTest {
    public static void main(String[] args) throws Exception {
//        String testPath = "/Users/yp-pc-m-7120/EclipseWorkSpace/tomcat-struggle-boss-product/commoncfg/runtimecfg/zkConfig.properties";
        String testPath = "/Users/yp-pc-m-7120/Software/ss5-3.8.9-8.tar.gz";
        BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(testPath)));
        InputStreamReader ifa = new InputStreamReader(new FileInputStream(testPath));
        String temp = "";
        int tempCount=0;
        int tempLen = 0;
        char[] tempChar = new char[1024];
//        while ((temp = bf.readLine()) != null) {
//            System.out.println(temp);
//        }

        while ((tempLen = bf.read(tempChar)) != -1) {
            tempCount +=tempLen;
//            System.out.println(new String(tempChar));
        }

        System.out.println("文件字符长度:  "+tempCount);

        BufferedInputStream bfi = new BufferedInputStream(new FileInputStream(testPath));
        byte[] tempByte = new byte[2048];
        int count = 0;
        int len=0;
        while ((len=bfi.read(tempByte))!=-1){
            count +=len;
//            System.out.println(new String(tempByte));
        }
        System.out.println("文件字节长度:  "+count);
    }
}
