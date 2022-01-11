package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();      // the data type is DOG since we have a dog ojbect then the data variable should be DOG
        dog1.name = "Lucy";    // dog 1 is an object with different copy of the instance DOG
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "small";
        dog1.color = "white";


        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "Whitle and Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Cinnamon", "German Shepard", 3, 'F', "Medium", "Warm Brown");


        Dog dog4 = new Dog();
        dog4.setInfo("Santa", "Pomeranian", 2, 'M', "Samll", "golden");


        Dog dog5 = new Dog();
        dog5.setInfo("Crunchy", "Golden Retriever", 4, 'F', "Medium", "Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));


        femaleDogs.removeIf(p -> p.gender == 'M');
        System.out.println("femaleDogs = " + femaleDogs);


        maleDogs.removeIf(p -> p.gender == 'F');
        System.out.println("maleDogs = " + maleDogs);


    }
}
