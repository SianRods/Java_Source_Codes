package com.rods;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void Laptop() {
        System.out.println("Laptop object created...");
    }

    public void compile() {
        System.out.println("Laptop is compiling...");
    }
}
