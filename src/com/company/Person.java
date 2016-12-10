package com.company;

import java.io.Serializable;

/**
 * Created by script972 on 09.12.2016.
 */
public class Person implements Serializable {
    String name;
    String lastName;
    String secondName;
    String numberPhone;
    String address;

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'';
    }

    public Person(String name, String lastName, String secondName, String numberPhone, String address) {
        this.name = name;
        this.lastName = lastName;
        this.secondName = secondName;
        this.numberPhone = numberPhone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
