package com.company;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/**
 * Created by script972 on 09.12.2016.
 */
public class Abiturient implements Serializable {
    int id;
    Person abi;
    double mark;

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", abi=" + abi +
                ", mark=" + mark+"}";
    }



    public Abiturient(int id, Person abi, double mark) {
        this.id = id;
        this.abi = abi;
        this.mark = mark;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getAbi() {
        return abi;
    }

    public void setAbi(Person abi) {
        this.abi = abi;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

}
