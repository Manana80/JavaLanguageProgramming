package day44_Abstraction.AnimalTask;

public final class Eagle extends Animal implements WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " eats snakes");
    }

    public void hunt() {
        System.out.println(getName() + " is hunting snakes");
    }
}
