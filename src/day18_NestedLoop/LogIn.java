package day18_NestedLoop;

import java.util.Scanner;
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed,
                then print "Your account is locked."
 */
public class LogIn {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if(u.equals("Cydeo")&& p.equals("WoodenSpoon")){
            System.out.println("Logged In");

        }else{
            for (int i = 1; i < 3; i++) { // we chose 3 because we already asked one before the loop
                System.out.println("Incorrect username or password!");
                System.out.println("Enter your username:");
                u = scan.next();
                System.out.println("Enter your password");
                p = scan.next();

                if(u.equals("Cydeo")&& p.equals("WoodenSpoon")){
                    System.out.println("Logged In");
                    break;

                }



            }

        }

        if(! (u.equals("Cydeo")&& p.equals("WoodenSpoon"))){
            System.err.println("Your account is locked, please contact support team");

        }



scan.close();










    }
}
