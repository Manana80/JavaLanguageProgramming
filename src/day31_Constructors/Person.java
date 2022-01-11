package day31_Constructors;

public class Person {
public String name;
public char gender;
public int age;


public Person (String name, char gender, int age){      // this is the parameterized constructor (no need to set info method anymore)
    this.name = name;
    this.gender = gender;
    this.age = age;
}




    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
