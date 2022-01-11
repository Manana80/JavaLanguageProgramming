package day10_NestedIfStatement;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n%2==0){                          // same data type of value in both if blocks
            System.out.println("Even");         // String
        }
        else {
            System.out.println("Odd");          // String
        }

        // In this case, we can apply ternaries to it.

        System.out.println("-----------------------------------");
        String result1 =(n%2==0)? "Even" : "Odd";
        // we made the if statement (using ternaries) as a variable so that it can be reused again.
        System.out.println(result1);
    // no curly braces just the value. since it will only return one value.
        System.out.println("----------------------------------------------");

        int age = 23;
        if (age >=21){
            System.out.println("Eligible");  // String
        } else {
            System.out.println("Not eligible"); // String
        }
        System.out.println("----------------------------------------");

        // Using ternaries

        String eligibility = (age>=21)? "Eligible" : "Not eligible";
        // This is always the preferred way in ternaries.
        // Ternaries have the same exact function as if statement. It is only shorter.

        System.out.println(eligibility);

        /* we can pass the if (ternaries) as result immediately in a print statement
        if we are not going to use it again.
         */
        System.out.println("----------------------------------------------");

        int number = -100;
        // found out if pos, neg or zero.

        if (number>0) {
            System.out.println("Positive");
        }
        else if (number<0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
        /*
        Each block is returning one value only. And all data types are of the same.
        Hence, we can apply ternaries to it
         */

        System.out.println("---------------------------------------");

        String result2 = (number>0)? "Positive" :(number <0)? "Negative" : "Zero";
        // :( this face represents else if block.
        // Using ternaries, we shortened 7 lines of code to one!

        System.out.println(result2);



    }
}
