package com.rods;


import jakarta.persistence.Embeddable;

// We are going to use this as an embeddable datatype in the hibernate by using the annotation
@Embeddable
public class Pancard {
        private int  number;
        private String birthday;
        private String POB;

// Mentioning the getter and setters method for the pancard class
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPOB() {
        return POB;
    }

    public void setPOB(String POB) {
        this.POB = POB;
    }
    @Override
    public String toString() {
        return "Pancard{" +
                "number=" + number +
                ", birthday='" + birthday + '\'' +
                ", POB='" + POB + '\'' +
                '}';
    }



}
