package com.example.spring;

import com.example.spring.implementation.BraveKnight;
import com.example.spring.service.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestingClass {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Knights.xml");
        Knight knight = (BraveKnight) context.getBean("braveKnight");
        knight.embarkOnQuest();
    }
}
