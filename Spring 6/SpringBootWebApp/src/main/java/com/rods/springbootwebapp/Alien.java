package com.rods.springbootwebapp;


import org.springframework.stereotype.Component;

@Component
public class Alien {
    // Taking the response form the form and directly saving it in the form of an object
    private int aid;
    private String name;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                '}';
    }
}
