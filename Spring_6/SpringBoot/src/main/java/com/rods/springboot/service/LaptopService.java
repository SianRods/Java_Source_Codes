package com.rods.springboot.service;

import com.rods.springboot.model.Laptop;
import com.rods.springboot.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laprepo;

    // Several methods to process the laptop object
    public void addLaptop(Laptop l) {
        // All the operations w.r.t jdbc and crud are performed by the repository layer
        System.out.println("Laptop has been processed in service :) ");
        laprepo.save();

    }

    public boolean isGoodForGaming() {
        return true;
    }


}
