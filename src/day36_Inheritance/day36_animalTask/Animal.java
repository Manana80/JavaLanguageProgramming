package day36_Inheritance.day36_animalTask;
/*
Advantages of Inheritiance: codes re-usability, less codes thererfore less memory, centralized structure, easy to maintain and organize
 */
public class Animal { // this is the parent or superclass
    // we have a default constructor here, hence in the child classes constructor is called upon implicitly as well.
    public String name, breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void setInfo (String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void move(){
        System.out.println(name + " is moving");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
