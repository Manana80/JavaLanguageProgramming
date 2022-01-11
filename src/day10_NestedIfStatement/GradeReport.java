package day10_NestedIfStatement;

public class GradeReport {
    public static void main(String[] args) {


        /*
        90 ~ 100 : Excellent
        80 ~ 89  : Great
        70 ~ 79  : Good
        60 ~ 69  : Passed
        0  ~ 59  : Failed

        pre-condition the score MUST be from (0-100)
         */

        int score = 40;
        String result = ""; // temporary empty string
        /* Since all statements will return us a string. It is not necessary to print new statement with every if block
        rather we can declare a variable result. and initialize it with empty double quotes, so we won't get a compiler error
         */

        if (score >=0 && score <=100) // once the condition is true. It can be evaluated to 5 possibilities
        {
            if (score >=90 ){ // no need to say score <=100 because it is already evaluated in the pre-condition.
                // false: score <90.
                result = "Excellent";
            }
            else if (score >= 80 ) {
                // not necessary to write && score <90 because it has already been checked in the previous if block.
                // this condition will be false when score < 80 so this condition will be carried out to the next block implicitly.
                result= "Great" ;
            }
            else if (score >= 70) { // false: score <70 , it will be implicitly given to the next block.
                result = "Good";
            }
            else if (score >= 60 ) {
                result = "Passed";
            }
            else {
                result = "Failed";
            }
            System.out.println(result); // here we used only one statement.

        }

        else { // if the score is not valid
            System.out.println(" Invalid Score"); }


        System.out.println("----------------------------------------------------------");




    }
}
