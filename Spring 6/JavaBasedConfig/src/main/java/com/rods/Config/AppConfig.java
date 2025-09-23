package com.rods.Config;


import com.rods.Desktop;
import com.rods.Laptop;
import com.rods.Programmer;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.rods")   // ==> Scan the com.rods package for obtaining the already available components
public class AppConfig {

//    @Bean(name = {"programmer", "alien"})
//    @Scope("prototype")
//    public Programmer programmer() {
//        return new Programmer();
//    }
//
//    @Bean(name = "laptop")
//    public Laptop laptop() {
//        return new Laptop();
//    }
//
//
//    @Bean(name = "desktop")
//    @Primary
//    public Desktop desktop() {
//        return new Desktop();
//    }


    /*
    Note that in case if the label/name is not present for a bean we can simply create a bean
    using the name of it's method
 */

}
