package com.cai;

/**
 * Created by caiyl on 2017/3/16.
 */
public class SampleClass {
    private String name;
    public String test(String input) {
        System.out.println("Hello world!");
        return "test1";
    }
    public String test2(String input) {
        System.out.println("test2");
        return "Hello world!";
    }

    public SampleClass(String name) {
        this.name = name;
    }

    public final String finalMethod(){
        System.out.println("final");
        return "final";
    }

}