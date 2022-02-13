package InterviewTasksCydeo;

import java.util.Scanner;

/*
Write a program that reverse a given String
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String str = scan.nextLine();

        System.out.println(reverseAString(str));



    }

    public static String reverseAString(String str){
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=""+str.charAt(i);
        }
        return reversed;
    }
}
