package day44_Abstraction.AnimalTask;

public final class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " is eating Biryani");
    }

    public final void Meow(){
        System.out.println(getName() + " is Meowing");
    }

    public void play() {
        System.out.println(getName() + " is playing with a ball");
    }
    public void meow(){
        System.out.println(getName() + " is meowing");
    }
}
