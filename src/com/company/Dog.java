package com.company;

public class Dog {
    private String name;
    private int age;
    private String color;
    private  String poroda;


    public String getName() {
        System.out.println("tuzik");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("2");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        System.out.println("kara");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPoroda() {
        System.out.println("afcharka");
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
}
