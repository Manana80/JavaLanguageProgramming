package day10_NestedIfStatement;


public class NestedIfIntro {
    public static void main(String[] args) {
       /*
       In order for these two conditions to be considered they should rely on the most important condition
       that we must check before everything else which is weather the score is valid or not!
       i.e. if the score is 400 it is not valid.

       The outputs are only possible when the score is valid.
        */
        int score = 95;
        if (score >=0 && score <=100) // This is the precondition. i.e. if the score is valid.
        {if (score >=60){ // if the student passed the exam.
            System.out.println("passed");}
        else { // otherwise, if the student failed the exam.
            System.out.println("failed");} } else // if the score is not valid
        {
            System.out.println("Invalid score");
        }
        /*
        For the original if statement of the precondition it is always either a single if , or if and else statement
        like this example.
         */

        // the if else statement is placed within the curly braces of the pre-condition (Hence the name nested).

    }

}