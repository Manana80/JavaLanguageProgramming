package day29_ArrayList.day37_Inheritance.day37_Inheritance_AnimalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }




}
