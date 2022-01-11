package day10_NestedIfStatement;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 550; // s == score
        if (s >=0 && s <=100) // This is the precondition. i.e. if the s is valid.
        {if (s >=60){ // if the student passed the exam.
            System.out.println("Passed");}
        else { // otherwise, if the student failed the exam.
            System.out.println("Failed");} } else // if the s is not valid
        {
            System.out.println("Invalid Score");
        }

        System.out.println("----------------------------------------------");
         // All are returning the same data value and each a single one ==> ternaries

       String result=  (s >=0 && s <=100)? (s >=60) ? "Passed" :"Failed" : "Invalid Score";
        System.out.println(result);

        /*
        ternaries are not recommended with nested if statement because we will be prone to more
        mistakes, and they won't be easily readable.
        Better used with if else and multiple if statement.
         */








    }
}
