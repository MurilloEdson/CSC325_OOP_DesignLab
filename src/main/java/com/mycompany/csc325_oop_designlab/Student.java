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

    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	
	// ToDo 4: Add comments to your code

}
