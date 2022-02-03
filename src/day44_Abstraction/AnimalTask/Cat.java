package day44_Abstraction.AnimalTask;

public final class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " is eating Biryani");
    }

    public final void Meow(){
        System.out.println(getName() + " is Meowing");
    }

}
