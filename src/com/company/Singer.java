package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void getSingerSingMethod() {
        System.out.println(getName() + " is a good " + bandName + "'s vocalist.");
    }

    public void getSingerPlayGuitarMethod() {
        System.out.println("And " + getName() + " is the only one in the " + bandName+ " who plays the guitar.");
    }

    @Override
    public void getLearnMethod() {
        super.getLearnMethod();
    }

    @Override
    public void getWalkMethod() {
        super.getWalkMethod();
    }

    @Override
    public void getEatMethod() {
        super.getEatMethod();
    }

    @Override
    public String toString() {
        return super.toString()+
                ", bandName= '" + bandName + '\'' ;
    }
}
