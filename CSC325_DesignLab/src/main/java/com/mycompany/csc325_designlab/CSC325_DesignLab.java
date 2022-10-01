package com.mycompany.csc325_designlab;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Edson
 */
public class CSC325_DesignLab {

    public static void main(String[] args) {

        // ToDo 8: The senior class should have a minimum of 85 credits  

        Student std1 = new Freshman("James", 20, 12); // name, age, credits

        Student std2 = new Senior("John", 30, 90);
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input new credits");
        
        int newGPA = scnr.nextInt();
        
        std1.setCredits(newGPA);
        System.out.println(std1.getName() + "'s new gpa is "+std1.getCredits());

        System.out.println(std1.toString());

        System.out.println(std2.toString());

        // ToDo 12: add comments and explain your code
        // ToDo 13: submit using a pull request.
    }
}
