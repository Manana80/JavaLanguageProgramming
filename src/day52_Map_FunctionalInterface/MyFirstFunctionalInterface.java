package day52_Map_FunctionalInterface;

@FunctionalInterface         // once we used the annotation it makes the interface functional otherwise it will be a regular interface
public interface MyFirstFunctionalInterface {
    // give a generic name like function, test , apply


    void apply (int n);  // this is an abstract method
    //void method(); // if we do it this way it will give us error since the functional interface can only have one abstract method





}
