package com.mycompany.csc325_designlab;

public abstract class Human {

    private String name;
    protected String address;
    private int age;

    // constructor that takes only two paras
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //name setter and getter
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    
    //Abstract methods are declared
    public abstract String getAddress();
    public abstract void setAddress(String address);
    
    //age setter and getter
    public int getAge() {
        return age;
    }public void setAge(int age) {
        this.age = age;
    }
}
