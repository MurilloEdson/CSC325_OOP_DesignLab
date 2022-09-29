package com.mycompany.csc325_oop_designlab;

/**
 *
 * @author MoaathAlrajab
 */

public class Student extends Human{
    
    private double GPA;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    //Address variable had to be changed in the parent class to protected

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

}
