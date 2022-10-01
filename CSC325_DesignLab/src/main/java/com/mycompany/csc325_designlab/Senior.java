package com.mycompany.csc325_designlab;

/**
 *
 * @author Edson
 */
public class Senior extends Student{
    
    // constructor that takes only three parameters
    public Senior(String name, int age, int credits) {
        super(name, age, credits);
        if(credits < 85){
           this.setPassing(false);
        }
    }
    //toString method had to be overridden to fit the project
    @Override
    public String toString() {
        String senior;
        senior = "Name:"+getName() +" Age:"+ getAge() +" Credits:"+ getCredits();
        return senior;
    }
    
}
