package day09_IfStatements;

public class PassedOrFailed {
    public static void main(String[] args) {

       int score = 75;
       /*
       we can either use 2 single if statement or we can use a single if and else statement to be
       more efficient. (only applicable when we have only two possibilities)
        */


        if (score >=60) {System.out.println( "Congrats, you passed");}
        // we created the boolean expression immediately within the if statement.

        else {System.out.println("Failed");}




    }
}
