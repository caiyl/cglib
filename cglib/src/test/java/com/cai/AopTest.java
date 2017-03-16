package com.cai;

/**
 * Created by caiyl on 2017/3/16.
 */
public class AopTest {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SayHello  sayHello = (SayHello) factory.createProxy(SayHello.class);
        sayHello.sayHello("zhangsan");
    }
}
