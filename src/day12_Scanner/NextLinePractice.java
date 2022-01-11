package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        /*
        1.Ask the user to enter age (nextInt() )
        2. Ask the user to enter full name  (nextLine() )

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();

        input. nextLine(); // to take out the Enter key that is left by the pervious Int method
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();
        input.nextLine();

        System.out.println("Enter your School Name:");
        String schoolName = input. nextLine();

        input.close();

        System.out.println("age = "+ age + " years old");
        System.out.println("Full name is: " + fullName);
        System.out.println("GPA = "+ gpa);
        System.out.println("School name is: " + schoolName);


    }
}
