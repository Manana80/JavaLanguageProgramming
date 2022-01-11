package practice_12_08_2021;

import java.util.Scanner;

/*
Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal
 */
public class SwitchPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an animal:");
        String animal = input.next().toUpperCase();
        String result = "";


        switch (animal) {
            case "DOG":
            case "CAT":       // because have the same results
                result = " domestic animal";
                break;
            case "TIGER":
                result = " wild animal";
                break;
            default:
                result = " Unknown animal ";


        }


        System.out.println(result);

input.close();
    }

}
