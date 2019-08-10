package it.frigir;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaHelloWorldTest {

    @Test
    void getHello() {

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World",javaHelloWorld.getHello());
    }
}