package de.ait.controller;

import de.ait.model.Duck;

public class Main {
    public static void main(String[] args) {
        // создали "голый" объект и наполнили его
        Duck scrooge = new Duck();
        System.out.println(scrooge.isMale);
        scrooge.name = "Scrooge McDuck";
        scrooge.age = 56;
        scrooge.isMale = true;
        scrooge.color = "white";
        // сразу создали и наполнили
        Duck donald = new Duck("Donald Duck", 25, "white", true);
        System.out.println(donald.age);
        // вызовем метод от дональда
        donald.hello(scrooge);
    }
}

// хочу создать класс Duck с полями:
// name
// age in month
// color
// sex