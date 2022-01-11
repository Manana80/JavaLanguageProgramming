package day35_Encapsulation.encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty()) {
            System.err.println("Invalid name!");
            return;
            // we can also just use return; because return exit the function or method
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (!(gender == 'F' || gender == 'M')) {
            System.err.println("Invalid gender!");
           return;
        }
        this.gender = gender;  // it will only executed when the gender is true if the if condition is false it will never be executed.
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 16 || age > 90) {
            System.err.println("Invalid age!");
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (salary <= 0) {
            System.err.println("Invalid salary!");
           return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary= $" + salary +
                '}';
    }
}
