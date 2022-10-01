package com.mycompany.csc325_designlab;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Edson
 */
public class CSC325_DesignLab {

    public static void main(String[] args) {
        
        //New students have been created
        Student std1 = new Freshman("James", 20, 12); // name, age, credits
        Student std2 = new Senior("John", 30, 86);
        
        //GPA is set for one student
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input new GPA");
        double newGPA = scnr.nextDouble();
        std1.setGPA(newGPA);
        System.out.println(std1.getName() + "'s new gpa is "+std1.getGPA());

        //toString is practiced and information is displayed
        System.out.println(std1.toString());
        System.out.println(std2.toString());
        
        //Test to see is senior is passing with 85 credits
        if(std2.passing){
            System.out.println(std2.getName() +" is passing");
        }else{
            System.out.println(std2.getName() +" is NOT passing");
        }

        // ToDo 13: submit using a pull request.
    }
}
