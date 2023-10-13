package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

    //creating constructor that takes in name, age, gpa
    //name and age come from Human
    //gpa comes from Student
    public Senior(String name, short age, int gpa) {
        super(name, age, gpa);
    }

    //implementing address from Human even though not used
    @Override
    public String getAddress() {
        return null;
    }

    //implementing address from Human even though not used
    @Override
    public void setAddress(String address) {
    }

    //Override Student toString
    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" +
                "Age: " + this.getAge() + "\n" +
                "Address: " + this.getAddress() + "\n" +
                "GPA: " + this.getGpa();
    }

}
