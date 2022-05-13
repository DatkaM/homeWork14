package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void getDancerMethod() {
        System.out.println(getName() + " learn new " + groupName + "'s dance.");
    }

//
    @Override
    public String toString() {
        return super.toString() +
                ", groupName= '" + groupName + '\'' ;
    }
}
