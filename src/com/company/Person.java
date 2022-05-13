package com.company;

public class Person {
    private String name;
    private String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;

    }
    public Person(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void getLearnMethod() {
        System.out.println(name + " never stop learn!");
    }

    public void getWalkMethod() {
        System.out.println(name + " likes to walk every day!");
    }

    public void getEatMethod() {
        System.out.println(name + " likes eat manty.");
    }

    @Override
    public String toString() {
        return "Person:" +
                " name= '" + name + '\'' +
                ", designation= '" + designation + '\'';
    }
}
