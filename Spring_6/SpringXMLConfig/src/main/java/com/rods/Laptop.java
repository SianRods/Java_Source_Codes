package com.rods;

public class Laptop implements Computer {
    public int ram;
    public String brand;

    public Laptop() {
        System.out.println("Laptop Object Created....");
    }

    /*
        Note that whenever we are using the paramaterized constructor we are actually trying to acheive
        sequential injection in order in xml file when are are not using the index value
        *Only mentioning the type works if the parameters are all of distinct types only
     */




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void compile() {
        System.out.println("Laptop is Compiling the Code .....");
    }
}
