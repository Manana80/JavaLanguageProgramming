package day30_CustomClass;

public class Dog {

    public String name; // each has different copies so that we can store multiple data in each object
    public String breed; // -instance means each object can have separate copy
    public int age;
    public char gender;
    public String size;
    public String color;


    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor ){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void bark(){
        System.out.println(name + " is barking");
    }

    public String toString() {  // now we won't have a hashcode when we try to print any object from the dog class
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes: // given as instance variables (to be able to store different copies within each object)
    name, age , gender, breed, color, size
Actions:
   eat() , play(), bark()...
 */