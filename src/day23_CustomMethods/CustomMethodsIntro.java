package day23_CustomMethods;

public class CustomMethodsIntro {

    public static void main(String[] args) {

        greeting();
       // once created , it can be called within the main method and it will be run.

        System.out.println("Test Started");

    }



    // public accessible to everybody.
    // void means the method doesn't return anything.
    public static void greeting(){          // here we place the body of the method i.e. the print statement
        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");
    }

    // it is recommended to minimize the method once created specially if you want to create another method
    // the method has to be called in order to be executed.

    // we cannot create a method within another method. because every method needs to be independent.


  // we  cannot create another method within the class , doesn't matter where. the only condition is that
    // it shouldn't be within the body of another method.






}
