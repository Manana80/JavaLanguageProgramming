package day37_Inheritance_AnimalTask;

public class Parrot extends Animal{
public  String parrotWingColor;

    public Parrot(String name, String breed, char gender, int age, String size, String color, String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor = parrotWingColor;
    }

    public void fly(){
        System.out.println(name + " is flying");
    }
    public void sing(){
        System.out.println(name + " is singing");
    }


}
