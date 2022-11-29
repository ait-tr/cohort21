package de.ait.model;

public class Duck {
    public String name;
    public int age;
    public String color;
    public boolean isMale;

    // Hello, имя, I am имя
    public void hello(Duck duck1) {
        System.out.println("Hello, " + duck1.name + ", I am " + this.name + "!");
    }
    public Duck() {
    }
    public Duck(String name, int age, String color, boolean isMale){
        this.name = name;
        this.age = age;
        this.color = color;
        this.isMale = isMale;
    }
}
// хочу создать класс Duck с полями:
// name
// age in month
// color
// sex