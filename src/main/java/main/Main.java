/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Acer
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/SpringBeans.xml");
        
        ctx.getBean("student");
        ctx.getBean("student");
        ctx.getBean("student");
        ctx.getBean("student");
        ctx.getBean("student");
        ctx.getBean("student");
        
//        System.out.println(obj);
    }

}
