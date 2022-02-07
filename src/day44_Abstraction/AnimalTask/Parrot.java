package day44_Abstraction.AnimalTask;

public final class Parrot extends Animal implements Playable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " is eating chocolate");
    }

    public void play() {
        System.out.println(getName() + " is playing with sticks");
    }
}
