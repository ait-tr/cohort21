package de.ait.model;

public class Employee {
    public int id;
    public String name;
    public double salary;
    public double taxAllowance;

    public double bankBalance;

    public void displayEmployee(){
        System.out.println("ID: "+id+", "+"Name: "+name+", "+"Salary "+salary+", "+"TaxAllowance "+taxAllowance);
        System.out.println("Bank Balance = "+bankBalance);
        System.out.println("***************************************************");
    }

    public void showNettoSalaryEmployee(){
        System.out.println("Netto salary is " + (salary-taxAllowance));
    }

}
