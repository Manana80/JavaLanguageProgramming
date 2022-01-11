package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= scan.next();

        System.out.println("Enter your last name");
        String lastName= scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

     //String initial = "" + f + l; // the reason for "" in the beginning because both f and l are char so in order to make the + to act as concatenation it needs to be preceded by a string
        String initial = f + "." + l;
        System.out.println("initial = " + initial);


scan.close();



    }
}
