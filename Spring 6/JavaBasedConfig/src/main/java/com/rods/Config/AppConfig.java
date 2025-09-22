package com.rods.Config;


import com.rods.Desktop;
import com.rods.Laptop;
import com.rods.Programmer;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "programmer")
    public Programmer programmer() {
        return new Programmer();
    }

    @Bean(name = "desktop")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean(name = "laptop")
    public Laptop laptop() {
        return new Laptop();
    }

    /*
    Note that in case 


     */

}
