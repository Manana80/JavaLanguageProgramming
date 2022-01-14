package day39_Recap.day39_Recap_CydeoTask;

/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */
public class Cydeo {
    public static void main(String[] args) {
        Developer developer = new Developer("Karkmaz", 29, 'M', 123, "Java Developer", 125000);
        System.out.println(developer);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);
        System.out.println(tester);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 2345, "Math teacher", 100000);
        System.out.println(teacher);

        Student student = new Student(" Suhaib", 30, 'M', 89, "SDET");
        System.out.println(student);

        System.out.println("-----------------------------------------------------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("------------------------------------------------------------------");

        developer.work();
        ;
        tester.work();
        teacher.work();
        // student.work(); is not possible because student doesn't inherit from employy

        System.out.println("--------------------------------------------------------------");
        developer.drink();
        developer.eat();
        developer.sleep();
        developer.fixingBugs();

        System.out.println("---------------------------------------------------------------------");

        tester.drink();
        tester.eat();
        tester.sleep();

        tester.creatTicket();

        System.out.println("-------------------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("----------------------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();
        student.study();

        System.out.println("----------------------------------------------------------------");


    }
}
