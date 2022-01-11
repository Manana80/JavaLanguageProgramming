package day37_Inheritance_AnimalTask;

public class Dog extends Animal{
    //child class must call parent class constructor if it is created explicitly.



    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);

    }

    public void bark(){
        System.out.println(name + " is barking");
    }
}
