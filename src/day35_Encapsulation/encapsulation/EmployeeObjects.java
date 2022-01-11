package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tatiana",'M',60,110000);
        System.out.println(employee1);


        Employee employee2 = new Employee("Aygun",'W',310,115000);

        employee2.setSalary(employee2.getSalary()+15000);
        employee2.setName("Layan");
        System.out.println(employee2);

    }
}
