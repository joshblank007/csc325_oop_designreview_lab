/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * @author MoaathAlrajab
 */
public class Student extends Human {

    // ToDo 1: Make this class a child of Human
    //use the extends keyword

    // ToDo 2: Fix the resulting errors
    //implement methods from human

    // ToDo 3: Add a field for GPA and create a setter and a getter

    // ToDo 4: Add comments to your code

    //member variable for gpa
    private int gpa;

    //getter and setter for gpa
    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    //student constructor with call to human class for name and age
    //gpa is a member variable in this class so we have to assign the passed in value
    // to it's member variable
    public Student(String name, short age, int gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    //methods from human
    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {
        this.setAddress(address);
    }

    //toString method to print out variables
    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" +
                "Age: " + this.getAge() + "\n" +
                "Address: " + this.getAddress() + "\n" +
                "GPA: " + this.getGpa();
    }


}
