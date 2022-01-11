package practice_12_15_2021;
/*
                       (SumOfEven_Odd)
                     Write a program using while loop, that calculates the sum of the even numbers between 0 and 10
                   */
public class SumOfEven_Odd {
    public static void main(String[] args) {

        int sumOfEven=0;
        int sumOfOdd=0;

        int i=5; // because the task said from 5-10

        do {   // whether it is true or not, we need the sum of Even and Sum of Odd numbers hence we are using do while.
            if (i % 2 == 0) {
                sumOfEven += i;
            } else {
                sumOfOdd += i;
            }
            i++;
        }
        while (i<=10);{
            System.out.println("Sum of even numbers is: " + sumOfEven);
            System.out.println("Sum of odd numbers is: " + sumOfOdd);
        }




    }
}
