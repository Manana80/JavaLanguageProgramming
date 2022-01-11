package day17_While_DoWhile;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class LogIn {
/*
you are writing a code for the log-in function of the Cydeo Application,
assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."
        If the credentials are not matched,
        the program should allow the user to have three attempts to enter correct
       credentials and if all three attempts are failed, then print "Your account is locked."
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter you password:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")){ // when first attempt is successful!
            System.out.println("Logged in");
        }else {
            int attempts = 3;
            while(!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts >0){ // while the credentials are invalid and user still has attempts to re-enter
                if(attempts==1){ // if the while condition is false, the loop will end! i.e. when the user enters the right credentials.
                    System.out.println("This is your last chance");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                 u = scan.next();

                System.out.println("Enter you password:");
                p = scan.next();
                attempts--;

            }
            if(u.equals("Cydeo") && p.equals("Cydeo123")){ // when the second or third attempts are successful
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked"); // when all 3 attempts are failed!!
            }



        }



scan.close();

    }}










