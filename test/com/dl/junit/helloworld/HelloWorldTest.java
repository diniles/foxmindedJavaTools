package com.dl.junit.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HelloWorldTest {

    @Test
    void testPrintHello() {
        assertEquals("Hello World!", HelloWorld.printHello("Hello World!"));
        assertEquals("World!", HelloWorld.printHello("World!"));
    }

    @Test
    void testPrintHelloNew() {
        assertEquals("Hello!", HelloWorld.printHello("Hello!"));
    }

}