package de.ait.controller;

import de.ait.model.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Person p1 = new Person();

        //p1.displayPerson();

        Person p2 = new Person(223355,"Vasilii","Petrov", 25, true);
        //p2.displayPerson();
        p2.setAge(12);
        //p2.displayPerson();

        //System.out.println(p2.getId());
        //System.out.println(p2.getFirstName());
        int pensionAge = 100-p2.getAge();
        //System.out.println(pensionAge);
        //p2.displayPerson();

        Person p3 = new Person(443322,"Eva","Polskay",33,false);
        //p3.displayPerson();

        Person p4 = new Person(66555, "Petrovich");
        //p4.displayPerson();
        p4.setAge(45);
        //p4.displayPerson();

        Person [] arrayPersons = new Person[5];
        arrayPersons[0]=p1;
        arrayPersons[1]=p2;
        arrayPersons[2]=p3;
        arrayPersons[3]=p4;
        arrayPersons[4]=new Person(443322,"Jack","Sparrow",45,true);

        ArrayTools.printArrayPerson(arrayPersons);


    }
}

// 1 package controller & model
// Model
// Books
// -> Class Book
// String title
// int isbn
// String author
// int years
// int pages
// Constructor 2 разных
// Getters and Setters
// Display

// Class - ArrayBookTools -> метод выводит на консоль массив книг

// Contoller -> Main
// 5 Создаете 5 разных книг