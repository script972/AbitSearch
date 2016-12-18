package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by script972 on 09.12.2016.
 */
public class Manipulate {

    ArrayList abiturients=new ArrayList<Abiturient>();

    public  void menu() {
        int i = 0;
        while (i == 0) {
            fromFile();
            readAbit();
            System.out.println("MENU");
            System.out.println("0. Выйти ");
            System.out.println("1. Добавить ");
            System.out.println("2. Считать");
            System.out.println("3. Найти");
            System.out.println("4. Удалить");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 0:
                    return;
                case 1:
                    addAbit();
                    break;
                case 2:
                    readAbit();
                    break;
                case 3:
                    findAbit();
                    break;
                case 4:
                    delAbit();
                    break;
                default:
                    mistake("Вы выбрали не существующий пункт меню");
            }
        }
    }

    private void delAbit() {
        System.out.println("Введіть ID абітуріента якого треба видалити з картатеки");
        ArrayList abiturientNew=new ArrayList<Abiturient>();
        Scanner scanner=new Scanner(System.in);
        int id=scanner.nextInt();
        Iterator iterator=abiturients.iterator();
        Abiturient abbb;
        while (iterator.hasNext()) {
            abbb= (Abiturient) iterator.next();
            if(abbb.getId()!=id) {
                abiturientNew.add(abbb);
            }

        }
        abiturients.clear();
        abiturients.addAll(abiturientNew);
       // System.out.println(abiturientNew);
        OutSerialize outSerialize=new OutSerialize();
        try {
            outSerialize.save(abiturients);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fromFile() {
        InSerialize inSerialize=new InSerialize();
        try {
            abiturients=inSerialize.read();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    private void findAbit() {
        Abiturient abiturient;
        Iterator iterator=abiturients.iterator();
        System.out.println("Ведіть ID абітуріента якого потрібно знайти");
        Scanner scanner=new Scanner(System.in);
        int id=scanner.nextInt();
        boolean isAbit=false;
        while (iterator.hasNext()){
           abiturient= (Abiturient) iterator.next();
            if (abiturient.getId()==id) {
                System.out.println("Абітуріент якого ви шукалы " + abiturient);
                isAbit=true;
            }
        }
        if(isAbit==false)
            System.out.println("Абітурента за заданим ID не знайдено");
    }

    private void readAbit() {
        Iterator iterator=abiturients.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private void addAbit() {
        int id;
        double mark;
        String name;
        String lastName;
        String secondName;
        String numberPhone;
        String address;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите количество абітурентов которых хотите добавить");
        int number=scanner.nextInt();
        int i=0;
        while (i<number)
        {
            i++;
            System.out.println("Введите id");
            id=scanner.nextInt();
            System.out.println("Введите фамилию");
            lastName=scanner.next();
            System.out.println("Введите имя");
            name=scanner.next();
            System.out.println("Введите отчество");
            secondName=scanner.next();
            System.out.println("Введите адрес");
            address=scanner.next();
            System.out.println("Введите номер телефона");
            numberPhone=scanner.next();
            System.out.println("Введите средний бал");
            mark=scanner.nextInt();
            abiturients.add(new Abiturient(id, new Person(name, lastName, secondName, numberPhone, address), mark));

        }
        System.out.println("новый список абитуриентов");
        OutSerialize outSerialize=new OutSerialize();
        try {
            outSerialize.save(abiturients);
        } catch (IOException e) {
            e.printStackTrace();
        }
        readAbit();
    }

    private void mistake(String s) {
        System.out.println("---------------------"+s+"-------------------------");
    }


}
