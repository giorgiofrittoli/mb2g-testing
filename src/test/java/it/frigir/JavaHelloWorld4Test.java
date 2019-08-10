package it.frigir;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorld4Test {

    @Test
    public void getHello() {

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World",javaHelloWorld.getHello());
    }
}