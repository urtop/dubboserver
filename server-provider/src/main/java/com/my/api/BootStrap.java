package com.my.api;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class BootStrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("dubbo-server.xml");
        context.start();
        System.in.read();

    }
}
