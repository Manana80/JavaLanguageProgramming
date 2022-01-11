package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi ;
    public static String name;

    public static ArrayList<Integer> numbers;


    //public static Sheet sheet ;

    public Circle(double radius){
        this.radius = radius;
        //  pi = 3.14;
    }


    static{
        // radius = 5;
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


    /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
*/

  /*  public static ArrayList<Integer>numbers = new ArrayList<>();
    numbers.add(10);
    this for example it will give us compile error if we want to declare it as a static variable because
    it takes more than one step , one to create the array list then assign values to it .. hence
    if we have multiple steps to set the static variable then use the STATIC BLOCK.
*/
    // public static Sheet sheet;  in order to set the variable we need every single data from excel sheet,
    // we will need multiple steps to set the static variable then it is better to create a static block
    // it won't be possible to set it in one step.
    /*
    Static blocks will always get executed first thing in the program before even the main method.
     */



}