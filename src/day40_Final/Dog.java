package day40_Final;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


public void eat (){
    System.out.println(getName() + " is eating dog food");
}
// public void drink(){ we get compile error here because final methods cannot be overriden
  //  System.out.println(getName() + " is drinking milk");

    public void bark(){
        System.out.println(getName() + " is barking");
    }
}





