package day37_Inheritance.day37_Inheritance_ScrumTask;

public class Tester extends Employee { // Tester IS A Employee , Tester IS A Person
    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void creatTicket(){
        System.out.println(name + " is creating a ticket");
    }











}
