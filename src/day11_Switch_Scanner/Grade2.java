package day11_Switch_Scanner;
/*
if the grade is A , B , C or D =====> Passed
F ==== > Failed
otherwise ====> invalid
 */
public class Grade2 {
    public static void main(String[] args) {
        char ch = 'A';
        String result = "";

        switch (ch) {
            /*
            case 'A':
             result = "Passed";
                break;
            case 'B':
                result = "Passed";
                break;

            case 'C':
                result = "Passed";
                break;
            case 'D':
                result = "Passed";
                break;
            default:
                result = "Failed";
             */
            case'A':  case'B': case'C': case'D': // can be written this way on one under another.
                result = "Passed";
                break;
            /*
            when we have case blocks that will return us the same output, we cannot use || logical
            operator since boolean are not accepted by switch statement.
            hence, we can write the cases without break which means all the blocks will be executed
            until break is reached. ( declare the case blocks with the same result back to back).

             */
            case'F':
                result = "Failed";
                break;

            default:
                result = "Invalid";

        }
        System.out.println("result = " + result);

        // && can not be used in switch statement




    }
}