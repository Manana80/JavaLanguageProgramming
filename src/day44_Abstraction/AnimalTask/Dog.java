package day44_Abstraction.AnimalTask;

public final class Dog extends Animal implements Playable{


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " is eating Pizza");
    }

public final void bark(){
    System.out.println(getName() + " is barking");
}



    public void play() {
        System.out.println(getName() + " is playing with a bone");
    }
}

/*
From Google: "A concrete class is a class that has an implementation for all of its methods.
It can also extend an abstract class or implement an interface as long as it implements all their methods.
It is a complete class and can be instantiated.
In other words, we can say that any class which is not abstract is a concrete class"
 */