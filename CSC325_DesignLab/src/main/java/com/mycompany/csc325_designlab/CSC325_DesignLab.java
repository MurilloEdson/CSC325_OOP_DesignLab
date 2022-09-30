package com.mycompany.csc325_designlab;

/**
 *
 * @author Edson
 */
public class CSC325_DesignLab {

    public static void main(String[] args) {


        // ToDo 6: Fix the constructor of Student class
        // Todo 7: Create two classes for Freshman and Senior 
        // ToDo 8: The senior class should have a minimum of 85 credits  
        // ToDo 9: Add a toString method for Freshman class
        // ToDo 10: Add a toString method for Senior class
        Student std1 = new Freshman("James", 20, 12); // name, age, credits

        Student std2 = new Senior("John", 30, 90);

        // ToDo 11: Set the gpa of the student using the scanner and user
        // 			input and then print the output.
        System.out.println(std1);

        System.out.println(std2);

        // ToDo 12: add comments and explain your code
        // ToDo 13: submit using a pull request.
    }
}
