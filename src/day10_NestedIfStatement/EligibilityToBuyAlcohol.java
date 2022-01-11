package day10_NestedIfStatement;

public class EligibilityToBuyAlcohol {
        public static void main(String[] args) {
            int age = 19;
            boolean hasId = true;     // This is the precondition

            if (hasId) // if the person has ID, then we need to check two conditions.
            // if this condition is met then we have two possible outputs.
            {if (age >=21) { // if the person is 21 years old or older.
                System.out.println("Eligible to buy alcohol");
            } else { // if the person is less than 21 years old.
                System.out.println("Not eligible to buy alcohol");
            }}
            else { // if the person doesn't have an ID.
                System.out.println("You must have an ID to buy alcohol");
            }
        }}


