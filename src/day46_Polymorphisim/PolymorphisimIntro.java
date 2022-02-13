package day46_Polymorphisim;

import day39_Recap.day39_Recap_Shape.Circle;
import day39_Recap.day39_Recap_Shape.Square;
import day43_Abstraction.EmployeeTask.Employee;
import day43_Abstraction.EmployeeTask.Tester;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day44_Abstraction.AnimalTask.Playable;

public class PolymorphisimIntro {
    public static void main(String[] args) {
        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double b2 = 5.5;

        Boolean r1 = true;

       // String [] array = {str, n1, n2, r1}; this is not acceptable because we have different data type. all these
        //data have no realtionship with String (non of them except for str is a String)

        Object [] array = {str, n1, b2, r1, new Circle(4),new Square(9)};
        // Object is the parent class of all classes Objec, is a generic name.

        /*
        driver = new ChromDriver();
        driver = new FireFoxDriver();

         */

        Employee employee = new Tester("Layan",41,'F',5680,"SDET",150000.00);
        employee.work();
        //employee.bugReport();


        Animal animal = new Dog("Max","Husky",'M',3,"Small","White");
        animal.drink();
        animal.eat();
        //animal.play();
        //animal.bark(); cannot be accessed since the refrence type determines what kind of methods and variables we have access to

        Playable animal2 = new Dog("Max","Husky",'M',3,"Small","White");
        System.out.println(animal2.isFriendly);
        animal2.play();
        //  animal2.drink();
       // animal2.eat();











    }
}
