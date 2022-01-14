package day39_Recap.day39_Recap_CydeoTask;
/*
 3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */
public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void creatTicket(){
        System.out.println(getJobTitle() + " " + getName() + " is creating a ticket");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }
}
