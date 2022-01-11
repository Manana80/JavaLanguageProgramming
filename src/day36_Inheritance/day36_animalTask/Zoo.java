package day36_Inheritance.day36_animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "White");

        dog.sleep();
        dog.eat();
        dog.drink();
        dog.bark();
        dog.move();
        // dog.hunt();
        //dog.scratch(); cannot be called because this method belongs to cat class
        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo("Murchik", "American shorhari", 'M', 8, "Extra large", "white and red");
        cat.meow();
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.scratch();
        cat.move();
        //cat.bark(); cannot be called
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "large", "red");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        System.out.println(tiger);

    }
}
