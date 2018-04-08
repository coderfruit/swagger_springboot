package com.stee.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class student {

    private static String userName;

    @Value("${yangjing}")
    public void setUserName(String userName) {
        student.userName = userName;
    }

//    @PostConstruct
    public void run(){
        System.out.println("-----------"+userName+"--------------");
    }
}
