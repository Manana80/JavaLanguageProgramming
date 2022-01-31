package day43_Abstraction.EmployeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester = new Tester("Sara",40,'F',0056,"QA",150000);
        Developer developer = new Developer("Danial",35,'M',809,200000);
        Teacher teacher = new Teacher("Lura",25,'F',9877,"Math teacher",100000);
        Driver driver = new Driver("Aaron",50,'M',1223,"Truck Driver",99000);

        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(developer);
        System.out.println(driver);

        tester.bugReport();
        developer.unitTest();
        teacher.sleep();
        driver.work();
        tester.eat();













    }
}
