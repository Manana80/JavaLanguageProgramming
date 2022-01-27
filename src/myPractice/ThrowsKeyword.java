package myPractice;

import day11_Switch_Scanner.ScannerIntro;
import day29_ArrayList.day37_Inheritance.day37_Inheritance_ScrumTask.ScrumMaster;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {

        // One way to get rid of the exceptions is by the TryCatch block but in this case we have to use multiple
        //ones. Since we are using the same method which is throwing us the same checked exception
        // We can use the throw keyword instead to get a shorter and cleaner code with less code fragments
        // This throws keyword informs the compiler about the exception that is about to happen so it will handle it immediately.

        /*
        System.out.println("Hello");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.getMessage();
        }


        System.out.println("World");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("How are you?");



         */
        System.out.println("Hello");

            Thread.sleep(3000);



        System.out.println("World");



            Thread.sleep(2000);



        System.out.println("How are you?");

        System.out.println("--------------------------------------------------------------------------");

        // throw keyword is totally different from throws keyword.
        //throw keyword is used for manually throwing an exception

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();
        // if the user enters an invalid age like (negative, or above 150) rather than terminating the program
        //we can throw an exception with a message that is understandable for the user.

        if(age<0 || age>130){
            throw new InputMismatchException("Invalid Age: " + age);

        }


        System.out.println("age = " + age);






    }
}
