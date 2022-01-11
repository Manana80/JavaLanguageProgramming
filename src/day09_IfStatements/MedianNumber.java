package day09_IfStatements;
/*
Create a class called MedianNumber.
write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
     // if we have three different numbers: one must be minimum, one maximum and one median.
    // Every If statement needs a boolean expression.

public class MedianNumber {
    public static void main(String[] args) {
       /* Since we have three values, then we have 3 possibilities:
       Possibility #1: a could be the median number.
       Possibility #2: b could be the median number.
       Possibility #3: c could be the median number.
       Because we have 3 DIFFERENT values, we have only 3 possibilities.
       Hence, we need to have 3 independent single if statements.

        */

        int a = 20, b = 90, c = 30;

        // if (a < b && a > c) we can create the condition immediately within the if statement without boolean.
        //       assume      a = 15, b=10, c =20  or a = 15 , c = 10 , b =20
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*
        In order for a ot be the median number, one of these conditions need to be met.
        (if c is the maximum number) and ( b is the minimum number) . Or
        (if b is the maximum number) and ( c is the minimum number).
         */
        boolean bIsMedian = (b > a && b < c) || (b > c && b < c);
        /*
        In order for b ot be the median number, one of these conditions need to be met.
        (if c is the maximum number) and ( a is the minimum number) . Or
        (if a is the maximum number) and ( c is the minimum number).
         */
        boolean cIsMedian = (c > a && c < b) || (c > b && c < a);
        /*
        In order for c ot be the median number, one of these conditions need to be met.
        (if a is the maximum number) and ( b is the minimum number) . Or
        (if b is the maximum number) and ( a is the minimum number).
         */

        if (aIsMedian) { // will be executed ONLY when if a is the median.
            System.out.println(a + " is the median number");
        }
        if (bIsMedian) { // will be executed ONLY when if b is the median.
            System.out.println(b + " is the median number");
        }
        if (cIsMedian) { // will be executed ONLY when if c is the median.
            System.out.println(c + " is the median number");
        }

    }
}

/* a note from a classmate: When you create an if statement
you write the condition within the ().
It is like creating a boolean, but you cannot recall the condition later
( it stays only within the if statement).
Creating Booleans allows you to recall the values
(like he did when he wrote !aIsMedian && !bIsMedian for the c variable).
 */