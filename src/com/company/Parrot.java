package com.company;

public class Parrot {
    private  String name;
    private String color;
    private int age;
    private  String poroda;

    public String getName() {
        System.out.println("popugai");
        return name;
    }

    public String getColor() {
        System.out.println("belyi");
        return color;
    }

    public int getAge() {
        System.out.println("1.5");
        return age;
    }

    public String getPoroda() {
        System.out.println("korrela");
        return poroda;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
}
