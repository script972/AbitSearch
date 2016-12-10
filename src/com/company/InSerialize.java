package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by script972 on 10.12.2016.
 */
public class InSerialize {
    public  ArrayList read () throws IOException, ClassNotFoundException {
        ObjectInputStream in =  new ObjectInputStream (new FileInputStream("abituriente.txt"));
        ArrayList rc1 = (ArrayList) in.readObject();

        return rc1;
    }
}