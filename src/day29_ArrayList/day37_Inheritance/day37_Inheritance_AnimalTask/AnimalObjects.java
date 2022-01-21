package day29_ArrayList.day37_Inheritance.day37_Inheritance_AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max","German Shepard",'M',2,"Large","Brown");
        System.out.println(dog1);
        dog1.bark();
        dog1.drink();
        dog1.eat();

        Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black");
        cat1.scratch();
        cat1.sleep();
        cat1.move();
        System.out.println(cat1);

        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small",
                "Blue", "Colorful;");
        System.out.println(parrot1);
        parrot1.sing();
        parrot1.fly();
        parrot1.eat();
    }
}
