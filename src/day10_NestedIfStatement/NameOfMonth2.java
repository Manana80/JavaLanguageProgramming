package day10_NestedIfStatement;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int n = 6;
        // write the name of the month representing the n.

        String result = "";

        if (n >= 1 && n <= 12)
        // if the n is valid (1 ~ 12) then one of the 12 blocks get executed.
        {
            if (n == 1) {
                result = "January";
            } else if (n == 2) {
                result = "February";
            } else if (n == 3) {
                result = "March";
            } else if (n == 4) {
                result = "April";
            } else if (n == 5) {
                result = "May";
            } else if (n == 6) {
                result = "June";
            } else if (n == 7) {
                result = "July";
            } else if (n == 8) {
                result = "August";
            } else if (n == 9) {
                result = "September";
            } else if (n == 10) {
                result = "October";
            } else if (n == 11) {
                result = "November";
            } else {
                result = "December";
            }


        } else // if the n is not valid
        {
            result = "Invalid Number";
        }
        System.out.println(result);

        System.out.println("--------------------------------------------------");

        String month = (n == 1) ? "January" : (n == 2) ? "February" : (n == 3) ? "March"
                : (n == 4) ? "April" : (n == 5) ? "May" : (n == 6) ? "June"
                : (n == 7) ? "July" : (n == 8) ? "August" : (n == 9) ? "September"
                : (n == 10) ? "October" : (n == 11) ? "November" : "December";

        // In ternaries the number of ? should always equal the number of :
        /*
        In the regular if statement, it is NOT OK not to give the parenthesis. IT IS A MUST.
        However, in ternaries we can take out the parenthesis which is an advantage (they are optional)
        However, it is highly recommended keeping them.
        We can write: n == 1 ? "January" : n ==2 ... etc.
         */

        System.out.println(month);


    }
}
