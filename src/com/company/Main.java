package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t=> Programmer <=");
        Programmer programmer = new Programmer("Datka", "developer", "GOOGLE");
        System.out.println(programmer);
        programmer.getCoding();
        programmer.getLearnMethod();
        programmer.getWalkMethod();
        programmer.getEatMethod();

        System.out.println("\t\t\t\t\t\t\t\t ~ Dancer ~ ");

        Dancer dancer = new Dancer("J-Hope", "main dancer", "BTS");
        System.out.println(dancer);
        dancer.getDancerMethod();
        dancer.getLearnMethod();
        dancer.getWalkMethod();
        dancer.getEatMethod();
        System.out.println("\t\t\t\t\t\t\t\t\t^* Singer *^");


        Person dastan = new Person();



        Singer singer = new Singer("Soojin","main vocalist","G-IDLE");
        System.out.println(singer);
        singer.getSingerSingMethod();
        singer.getSingerPlayGuitarMethod();
        singer.getLearnMethod();
        singer.getWalkMethod();
        singer.getEatMethod();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
