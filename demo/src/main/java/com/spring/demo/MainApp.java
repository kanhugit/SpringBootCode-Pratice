package com.spring.demo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load beans.xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the bean by ID
        MyBean myBean = (MyBean) context.getBean("myBean");

        // Call method
        myBean.showMessage();
    }
}

