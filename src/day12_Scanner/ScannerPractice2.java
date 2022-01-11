package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // System.out.println("Enter true or false:");
       // boolean result = input.nextBoolean();

        System.out.println("Enter your name: " );
        String name = input.next(); //e.g. Java Programming
        // anything after java won't be read because we used next () which only reads one word. i.e. until the first space.
        // input. next() : returns input as a String, read the input only until a space.
        //if enter JavaProgrammingLanguage it will appear as it is because no space
        // if we have a character it will read it e.g. wooden_spoon will appear as it is.
        // This method will be used when we are expecting one word input from the user.
        System.out.println("name = "+name);

        input.close();
















    }
}
