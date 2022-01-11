package day08_IfStatements;

/*
- Logical operators include: && (and), || (or), (!) not.
- They all return a true or false results (i.e. boolean).
- && and or are used when we have one boolean variable that includes more than one expression
 */
public class LogicalOperators {
    public static void main(String[] args) {
        // suppose we have two conditions to check the eligibility of someone to vote.
        // The information that have to be checked are age, and citizenship status.
        // Since, both conditions are required to vote, then we have to use the && logic and both conditions must be true!
        /*
        To solve such codes, we need to declare the variables first, then the condition using
        boolean expression showing both required conditions.
       */
        String name = "Aaron";
        int age = 14;
        String citizen = "USA";

        //( Try Steve, age 19, from Uk), ( Try Layan, age 41, from Iraq), (Daniel, 34, USA)

        boolean isEligible = age >= 18 && citizen == "USA";
        // && is used to see the eligibility of person to vote
        // Analyze the answer:       14 >= 18 && "USA" =="USA"
        //                           False  &&  True ====> False
        // As long as the first expression is false, there is no need to analyze the second expression, because in order to return a true result we need for both expressions to be true.

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-------------------------------------------------");

        // Suppose a person is applying to a loan, credit score and age are the only requirements to determine eligibility.

        String name2 = "Josh";
        int creditScore = 720;    //  at least 700 points
        int age2 = 23;           // must be at least 21 years old.

        boolean isEligible2 = creditScore >= 700 && age2 >=21; // we can add more conditions by adding another &&
        // Example if the income is needed also
        // boolean isEligible2 = creditScore >= 700 && age2 >=21 && income >60000;
        // so if Josh's income was 40000 the result will be false even though first two conditions were met!

        // try with (credit score 700), (age 19) , (500 and age 17)
        System.out.println(name2 + " is eligible for a loan: "+ isEligible2);

        /*
        In summery: the logical and operator will check all the conditions.
        If all are true then it will return a true result. Once, a condition is not met, it will
        return a false result.
         */

        System.out.println("----------------------------------------------------");

        // || (Logical or operator) meaning either.
        // suppose we want a person is eligible to register for selective service.
        // Age must be >= 18, Gender can be either.
        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        // we placed the gender within the parenthesis because we want it as one expression, rather than declaring two variables.
        // Analysis:             21>=18  && (M = false || F = true)
        //                         true  &&      true =====> True (because in Or operator only one condition need to be true in order for the expression to be true.)

        System.out.println( name3 + " is eligible to register "+ isEligible3);

        System.out.println("------------------------------------------------");

        // Example: in order to become a US citizen. you either need to be born in the US or married to a US citizen.

        String name4 = "James";
        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        // only one of the conditions must be met in order to get a true result.
        // with logical  OR operator we have more chances of getting true (75%) because only one condition need to be true.
        // if the first expression is true in logical || operator is true, there is no need to check the second expression. the result is already true.
        // On the contrary, we only have 25% chance of getting true with logical and operator, because all conditions need to be met in order to return a true result.

        // Analysis                        False        ||  false

        System.out.println(name4 + " is eligible to apply for US citizenship: " + isEligible4);
        // try with country of birth is UK, try with married to US citizen is true.

        System.out.println("---------------------------------------------------------------");

        //Example: Scholarship requirements
        String student = "Anna"; // try Breanna , Jena
        double gpa = 3.5; // try 2.5 , 2.5
        int familyIncome = 100000; // trey 40000 , 200000

        boolean isEligibleForScholarship = gpa >= 3.5 || familyIncome<= 60000;
        // try Ali, gpa 2.5, family income is 50000. ====> true

        System.out.println(student + " is eligible for scholarship " +isEligibleForScholarship);

        System.out.println("----------------------------------------------");
        // Logical ! will return us the opposite of the boolean operator.
        // Example
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("----------------------------------------");
        //Example
        int score = 85; // try score 55
        boolean passed = score >=60;
        boolean failed = !passed;

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);

        // it is not possible that both of them will return us true, or both of them will return us false.





    }
}
