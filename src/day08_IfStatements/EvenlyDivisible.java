package day08_IfStatements;
/*

2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */
public class EvenlyDivisible {
    public static void main(String[] args) {
        int num = 65;
        boolean divisibleBy2 = num%2 == 0; // we need to compare it to zero. If there is a remainder it won't equal zero
        boolean divisibleBy3 = num%3 ==0;
        boolean divisibleBy5 = num%5 ==0; // when there is no remainder it will equal to 0.

        // if the remainder of a number divided by 2 is zero then it is evenly divisible by 2.

        System.out.println(num + " is divisible by 2: " + divisibleBy2);
        System.out.println(num + " is divisible by 3: " + divisibleBy3);
        System.out.println(num + " is divisible by 5: " + divisibleBy5);


        // In this case we combined two operations I can include the remainder within boolean because the task requires the last result to be true or false.





    }
}
