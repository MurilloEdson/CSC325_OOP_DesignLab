
package com.mycompany.csc325_designlab;

/**
 *
 * @author Edson
 */
public class Freshman extends Student{
    
    // constructor that takes only three parameters
    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }
    //toString method had to be overridden to fit the project
    @Override
    public String toString() {
        String freshman;
        freshman = "Name:"+getName() +" Age:"+ getAge() +" Credits:"+ getCredits();
        return freshman;
    }
    
}
