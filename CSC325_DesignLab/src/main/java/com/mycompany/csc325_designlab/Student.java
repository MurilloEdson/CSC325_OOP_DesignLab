package com.mycompany.csc325_designlab;

public class Student extends Human{
    
    private double GPA;
    protected int credits;
    protected boolean passing = true;
    
    //passing setter and getter
    public boolean isPassing() {
        return passing;
    }public void setPassing(boolean passing) {
        this.passing = passing;
    }
    
    //credits setter and getter
    public int getCredits() {
        return credits;
    }public void setCredits(int credits) {
        this.credits = credits;
    }
    
    //Constructor with name, age and credits
    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    
    //GPA setter and getter
    public double getGPA() {
        return GPA;
    }public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    //Address variable had to be changed in the parent class to protected
    //Abstract methods have to be implemented
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

}