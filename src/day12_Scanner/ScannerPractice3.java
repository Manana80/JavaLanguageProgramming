package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        //123 Enter. Enter key will be read if we use the nextLin(). It can also read the space.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = input. nextLine();
        // it reads everything

        System.out.println(" Enter your programming language");
        String programming = input. nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        // 24 Enter , this method cannot read the enter key.
        // It will be left in the scanner's memory

        input.nextLine(); // to capture the Enter key left in Scanner's memory.

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        input.close();
        // because the enter key was left from the previous step.
        // It will be taken by this method and included in the output!
        // Hence, we cannot provide any input!!!
        /* we need to take the enter key from the scanner's memory before school name
        hence, we can use the nextLine method again.
         */

        /*
        all other methods will ignore the Enter key except for the nextLine method. Hence to
        remove the left Enter key we have to introduce the Next line method to capture the Enter key
        left in Scanner's memory. Otherwise, we won't be able to provide any input later on.
         */

        /*
        nextLine(): if we are using it after other methods of scanner, we MUST provide one
        additional nextLine():
         */


        System.out.println("Full Name = " + fullName);
        System.out.println("Programming Language is: " + programming);
        System.out.println("Age = " + age);
        System.out.println("School Name = "+ schoolName);












    }
}
