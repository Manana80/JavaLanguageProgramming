package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        // Task is to test the eligibility of a person to vote.

        String name = "Josh";
        int age = 38;                 // True
        String citizen = "USA";       // True
        // In the && logic since both return true then the statement is true.

        boolean isEligible = age >= 21 && citizen == "USA";   //true

        //Analysis: Two possible outcomes: either
        // Eligible  
        if (isEligible) {         //True
            System.out.println("Eligible");

            // Not eligible!

            if (!isEligible) { // The condition is the opposite of Eligible, hence we used the operator (!).
                System.out.println("Not Eligible");
                // !True == False hence the body of this if block won't be executed.
            }
            // there is only one possibility that one of the conditions is true and that one statement will be executed.



        }
    }}


