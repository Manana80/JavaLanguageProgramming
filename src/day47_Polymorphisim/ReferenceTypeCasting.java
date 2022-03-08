package day47_Polymorphisim;

import day43_Abstraction.EmployeeTask.*;
import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Cat;
import day44_Abstraction.AnimalTask.Dog;
import day45_Abstraction.Shape.Circle;
import day45_Abstraction.Shape.Cube;
import day45_Abstraction.Shape.Shape;
import day45_Abstraction.Shape.Square;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Shape shape =new Circle(4);  // in the background Circle is being upcasted to Shape (happens implicitly)
        // Without this type of casting we won't be able to achieve this polymorphism.

        //WebDriver driver = new ChromeDriver(); another example of upcasting

        Animal animal = (Animal) new Dog("Max","Husky",'M',3,"Small","White");
       // animal.bark(); cannot be dong without downcasting
       // Dog dog2 =  new Dog("Max","Husky",'M',3,"Small","White");
        // Dog dog3 = dog2; same or smaller reference type

      //  Dog dog = (Dog) animal; // both are pointing to the same dog this is upcasting , we assigned it to a variable
        // when we want to use it for more than once.
        System.out.println(animal.getName());
      //  System.out.println(dog.getName());

        // animal.bark(); cannot be done
       // dog.bark();

        (  (Dog) animal).bark(); // this is called grouping, and we use it when we only need to use the new reference once.
        Shape shape1 = new Square(5);
        System.out.println( ((Square) shape1).getSide() );

        System.out.println("-----------------------------------------------------------------------");

        Animal animal2 = new Cat("Jim","Persian",'M',3,"small","White");
       // Cat cat = (Cat) animal2;
      //  cat.meow();
      ( (Cat) animal2 ).meow(); // these outer parenthesis are important. it groups the casting so that it will be
        // prioritized first and then calling the meow method.

        // ((Dog) animal2).bark();    no compile error but we will get ClassCastException because there is no is a relationship
        // between dogs and cats

        System.out.println("------------------------------------------------------------------------");
        Employee employee = new Tester("Layan",41,'F',5680,"SDET",150000);

        ((Tester)employee).bugReport();
        //((Tester)employee).unitTest(); this method doesn't belong to tester
        //((Developer)employee).unitTest(); // still wrong since there is no isARelationship between testers and develpers

       // Driver driver = (Driver) employee; // line 1  (no is a relationship between tester and driver)
        Person person = (Person) employee; // line 2
       // Teacher teacher = (Teacher) employee; // line 3

        System.out.println("--------------------------------------------------------------------");
        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
        ((Cube)s1).volume(); // s1 is a circle and circle cannot have volume so we will get the exception











    }
}
