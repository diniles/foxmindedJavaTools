package com.dl.junit.helloworld;

public class HelloWorld {
    public static String printHello(String s) {
        return s;
    }

    public static void main(String[] args) {
        System.out.println(printHello("Hello World!"));
        System.out.println(printHello("Hello!"));
        System.out.println(printHello("World!"));
    }
}
