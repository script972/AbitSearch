package com.company;

import com.company.Abiturient;

import java.io.*;
import java.util.*;
public class OutSerialize {
    public  void save (  ArrayList rc1) throws IOException {
//создание цепи потоков с потоком вывода объекта в конце
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("abituriente.txt"));
        out.writeObject(rc1);
        out.close();
    }
}