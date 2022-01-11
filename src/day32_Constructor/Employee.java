package day32_Constructor;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee (String name){
        this.name = name;
    }

public Employee (String name, char gender){
       //  this.name = name;        we should call the method with this code fragment rather than repeating it.
      // Employee(name)          we cannot call the constructor within another constructor (unlike other methods)
    this(name);  // this is how we can call a constructor within another constructor (Constructor call)
    this.gender=gender;
}

    public Employee(String name, char gender, String jobTitle) {
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee (String name, char gender, String jobTitle, double salary){
        this(name, gender,jobTitle);
        this.salary = salary;
    }



    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
