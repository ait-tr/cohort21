package de.ait.controller;

import de.ait.model.Employee;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Employee peter = new Employee(); // Создали переменную peter класса Employee
        peter.id=1234567;
        peter.name="Petr Ivanov";
        peter.salary=55000;
        peter.taxAllowance=9900;
        peter.bankBalance=8800;

        peter.displayEmployee();
        //String str1 = "Hello";
        peter.showNettoSalaryEmployee();

        Employee eva = new Employee();
        eva.name="Eva Smirnoff Raum";
        eva.id=7654321;
        eva.salary=70000;
        eva.taxAllowance=8800;
        eva.bankBalance=9900;


        eva.displayEmployee();
        eva.showNettoSalaryEmployee();
        eva.displayEmployee();

        Employee volodya = new Employee();
        volodya.salary=80000;
        volodya.name="Volodya Sharapov";
        volodya.id=777888999;
        volodya.taxAllowance=15000;
        volodya.bankBalance=3600;

        volodya.displayEmployee();
        volodya.showNettoSalaryEmployee();



        eva.bankBalance=-1000;
        eva.displayEmployee();




    }
}