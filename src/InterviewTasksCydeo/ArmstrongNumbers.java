package InterviewTasksCydeo;

import java.util.Scanner;

/*
 Numbers -- Armstrong numbers
Write a method that can check if a number is an Armstrong number
p.s. An Armstrong number of three digits is an integer such that the sum of the cubes of
its digits is equal to the number itself.
e.g. 370 = (3*3*3) + (7*7*7) + (0*0*0)
             27    +   343   +    0
 */
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = scan.nextInt();
        if (num < 0) {

            throw new RuntimeException("Invalid number: " + num);
        }
        isArmstrongNumber(num);


        scan.close();

    }
    public static void isArmstrongNumber(int number) {
        //  We have to isolate the digits of the number given by the user.
        // We have to create another int for the isolated digit (r)
        int temp = number;
        int sum = 0;
        while (number > 0) {
            int r = number % 10; // This will give us the last digit
            sum = sum + r * r * r;
            number = number / 10; // so that we will get rid of the first digit which we already used in the sum;
        }
        if (temp == sum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }

    }



}
 /*
           When the loop first runs r will give us the first digit that will be added to the sum after being cubed.
           now num is equal to remaining 2 digits , when the loop runs again r now will equal to the first digit
           e.g if num = 371
          first loop     r= 1 , num = 37 and sum = 1                 num >0
          second loop    r=7 , num =3 and sum = 1+(7*7*7) = 344      num >0
          third loop     r=3,  num = 0 and sum = 344 + (3*3*3)
                                               = 344 + 27  = 371

            */