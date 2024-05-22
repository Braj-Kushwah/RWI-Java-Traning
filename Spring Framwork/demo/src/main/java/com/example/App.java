package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.cfg.xml");

        Student s1=context.getBean("stu1",Student.class);
        System.out.println(s1);

        Student s2=context.getBean("stu2",Student.class);
        System.out.println(s2);

        Student s3=context.getBean("stu3",Student.class);
        System.out.println(s3);
    }
}