package com.okay.dubbo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: liuzhanhui
 * @Decription:
 * @Date: Created in 2018-06-22:14:35
 * Modify date: 2018-06-22:14:35
 */
public class StudentCustomer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("student-customer.xml");
        context.start();
        IUserServer userServer = (IUserServer) context.getBean("userSerever");
        List<String> ids = userServer.getUsers(1000);
        System.out.println(ids);
    }
}
