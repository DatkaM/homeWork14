package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void getCoding() {
        System.out.println(getName() + " work on " + companyName );
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
        return super.toString() +
                ", companyName= '" + companyName + '\'' ;
    }
}
