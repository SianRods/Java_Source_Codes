package com.rods.springboot.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public  Desktop(){
//        System.out.println("Desktop Object Created...");
    }


    public void compile() {
        System.out.println("Desktop is Compiling......");
    }
}
