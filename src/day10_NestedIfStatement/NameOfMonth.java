package day10_NestedIfStatement;


public class NameOfMonth {
    public static void main(String[] args) {
        int number = 12;
        // write the name of the month representing the number.
        // A pre-condition must be created (1 ~ 12)
        // We only want to use ONE print statement, since all the data types are Strings.
        String result = ""; // temporary value can be empty string or any word really!
        /* This temporary variable should be initialized by "" to prevent any compiler error
         any variable declared within the main method or within the if block is called a local variable
         which should be initialized before using in the if blocks*/

        if (number >= 1 && number <= 12)
        // if the number is valid (1 ~ 12) then one of the 12 blocks get executed.
        {
            if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "February";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            } else if (number == 10) {
                result = "October";
            } else if (number == 11) {
                result = "November";
            } else {
                result = "December";
            }


        } else // if the number is not valid
        {
            result = "Invalid Number";
        }
        System.out.println(result);


    }
}
