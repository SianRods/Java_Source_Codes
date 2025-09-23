package com.rods.springboot.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class LaptopRepository {

    public void save(){
        /*
        Performing jdbc steps to save the laptop object
         */
        System.out.println("Laptop Saved to DB..");
    }


}
