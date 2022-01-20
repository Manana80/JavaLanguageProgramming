package day40_Final;

public class Animal {
    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    // setters cannot ever be generated for final variables since they are unchangeable.
    // but we can generate getters to all since reading doesn't affect the data , only reads


/// ------------------------------------- Getters ---------------------------------------------///

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    ///------------------------------------ Setters -----------------------------------------------///
    // remember can only be generated for non final variables


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating"); // in the parent class we don't need to say getName()
    }
    public final void drink(){
        System.out.println(name + " is drinking water");
    }
}
