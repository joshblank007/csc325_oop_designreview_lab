/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        // ToDo 5: Fix the error

        // ToDo 6: Fix the constructor of the Student class

        // Todo 7: Create two classes for Freshman and Senior

        // ToDo 8: The senior class should have a minimum of 85 credits

        // ToDo 9: Add a toString method for the Student class

        // ToDo 10: Add a toString method for the Freshman class

        // ToDo 11: Add a toString method for the Senior class

        // ToDo 12: Set the gpa of the student using the scanner and user
        // 			input and then print the output.

        // ToDo 13: add comments and explain your code

        // ToDo 14: submit using a pull request.

        //object for Student class
        //casting short because it is needed (bug for intellij)
        Student std1 = new Student("James", (short) 20, 50);

        //object for Freshman class
        //casting short because it is needed (bug for intellij)
        Freshman std2 = new Freshman("Josh", (short) 21, 12); // name, age, credits

        //object for Senior class
        //casting short because it is needed (bug for intellij)
        Senior std3 = new Senior("John", (short) 30, 90);

        //printing variables from student object
        System.out.println("Student 1");
        System.out.println(std1.toString());
        System.out.println();

        //scanner to get user input for gpa
        Scanner scan = new Scanner(System.in);

        //printing variables from freshman object
        System.out.println("Student 2");
        System.out.println("Type your gpa: ");
        std2.setGpa(scan.nextInt());
        System.out.println(std2);
        System.out.println();

        //printing variables from senior object
        System.out.println("Student 3");
        System.out.println("Type your gpa: ");
        std3.setGpa(scan.nextShort());

        //tests to see if GPA is at least 85 for senior object
        if (std3.getGpa() < 85) {
            System.out.println(std3);
            System.out.println("Better luck next year!");
        } else {
            System.out.println(std3);
            System.out.println("Congrats");
        }

    }

}

