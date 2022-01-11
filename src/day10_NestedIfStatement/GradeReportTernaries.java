package day10_NestedIfStatement;

public class GradeReportTernaries {
    public static void main(String[] args) {
  /*
        90 ~ 100 : Excellent
        80 ~ 89  : Great
        70 ~ 79  : Good
        60 ~ 69  : Passed
        0  ~ 59  : Failed

        pre-condition the s MUST be from (0-100)
         */

        int s = 99;
        String result = ""; // temporary empty string
        /* Since all statements will return us a string. It is not necessary to print new statement with every if block
        rather we can declare a variable result. and initialize it with empty double quotes, so we won't get a compiler error
         */

        if (s >=0 && s <=100) // once the condition is true. It can be evaluated to 5 possibilities
        {
            if (s >=90){ // no need to say s <=100 because it is already evaluated in the pre-condition.
                // false: s <90.
                result = "Excellent";
            }
            else if (s >= 80) {
                // not necessary to write && s <90 because it has already been checked in the previous if block.
                // this condition will be false when s < 80 so this condition will be carried out to the next block implicitly.
                result= "Great" ;
            }
            else if (s >= 70) { // false: s <70 , it will be implicitly given to the next block.
                result = "Good";
            }
            else if (s >= 60) {
                result = "Passed";
            }
            else {
                result = "Failed";
            }
            System.out.println(result); // here we used only one statement.

        }

        else { // if the s is not valid
            System.out.println(" Invalid Score"); }


        System.out.println("----------------------------------------------------------");

        String grade = (s >=0 && s <=100)? (s >=90)? "Excellent" :(s >= 80)? "Great"
                :(s >= 70)? "Good" :(s >= 60)? "Passed":"Failed" : "Invalid Score";

        System.out.println(grade);

        System.out.println("----------------------------------------------");
        // Another way of solving the task is by including ternaries within the nested if.

        String result2 = "";
        if (s>= 0 && s<=100) {
            result2 =(s >=90)? "Excellent" :(s >= 80)? "Great"
                :(s >= 70)? "Good" :(s >= 60)? "Passed":"Failed";} else {
            System.out.println("Invalid");
        }


    }
}
