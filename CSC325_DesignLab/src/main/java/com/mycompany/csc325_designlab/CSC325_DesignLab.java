package com.mycompany.csc325_designlab;

/**
 *
 * @author Edson
 */
public class CSC325_DesignLab {

    public static void main(String[] args) {

        // ToDo 8: The senior class should have a minimum of 85 credits  

        Student std1 = new Freshman("James", 20, 12); // name, age, credits

        Student std2 = new Senior("John", 30, 90);

        // ToDo 11: Set the gpa of the student using the scanner and user
        // 			input and then print the output.
        System.out.println(std1.toString());

        System.out.println(std2.toString());

        // ToDo 12: add comments and explain your code
        // ToDo 13: submit using a pull request.
    }
}
