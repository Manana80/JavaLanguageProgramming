package day10_NestedIfStatement;
// This class is Just FYI
public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {

        int number = 10;
        String result = "";

        // if there is only one statement in the if block, we can write it without the curly braces.

        if (number >= 1 && number <= 12)
        // if the number is valid (1 ~ 12) then one of the 12 blocks get executed.
        {
            if (number == 1)
                result = "January";
             else if (number == 2)
                result = "February";
             else if (number == 3)
                result = "March";
              else if (number == 4)
                result = "April";
             else if (number == 5)
                result = "May";
            else if (number == 6)
                result = "June";
             else if (number == 7)
                result = "July";
             else if (number == 8)
                result = "August";
             else if (number == 9)
                result = "September";
             else if (number == 10)
                result = "October";
             else if (number == 11)
                result = "November";
            else if (number == 12)
                result = "December";
            }


        else // if the number is not valid
        {
            result = "Invalid Number";
        }
        System.out.println(result);



// but if we have more than one print statement without the block, we have to add the curly braces.






    }
}