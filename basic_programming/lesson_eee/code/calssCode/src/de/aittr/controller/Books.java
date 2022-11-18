package de.aittr.controller;

public class Books {
    int iumber;
    String name;

    public Books(int iumber, String name) {
        this.iumber = iumber;
        this.name = name;
    }

    public int getIumber() {
        return iumber;
    }

    public void setIumber(int iumber) {
        this.iumber = iumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Books{" +
                "iumber=" + iumber +
                ", name='" + name + '\'' +
                '}';
    }
}
