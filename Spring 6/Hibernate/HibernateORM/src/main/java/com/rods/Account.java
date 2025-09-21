package com.rods;


import jakarta.persistence.*;

@Entity
//@Table(name ="account_table");
public class Account {
    // Annotating the required primary key

    @Id
    @Column(name = "acnt_no")
    public int accntNumber;
    @Column(name = "account_name")
    public String name;

    public Pancard getPancard() {
        return pancard;
    }

    public void setPancard(Pancard pancard) {
        this.pancard = pancard;
    }

    @Column(name = "loc")
    public String location;

    // Here we will have the pancard details of the corresponding customer
    @Column(name = "pancard")
    public Pancard pancard;

    @Transient
    public int intermediateProcessingValue;

    public int getAccntNumber() {
        return accntNumber;
    }

    public void setAccntNumber(int accntNumber) {
        this.accntNumber = accntNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "pancard=" + pancard +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", accntNumber=" + accntNumber +
                '}';
    }
}
