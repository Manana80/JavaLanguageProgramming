package day11_Switch_Scanner;
/*
28 Days: the number of the month must be 2.
30 Days: the number of the month must be either 4, 6, 9 and 11, 12.
31 Days: 1,3,5,7,8.

if (1~12){}
else {invalid}
 */
public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int number = 2;
        int year = 2012;
        String output = "";

        //This is an example on how to use switch statement within if statement.

        if (number>=1 && number<=12){
            switch (number){
                case 2: // order of the cases is not necessary
                    // we will create if condition under february because it can be 29 days in leap years
                    /*
                    if (year %4 ==0){   output = "29 days";
                    }
                    else {
                        output = "28 days";
                    }
                     */
                     output = (year%4==0)?"29 days":"28 days";      // using ternaries
                    break;
                case 4: case 6: case 9: case 11: // here we are saying either one of them.
                    // || logic we can use it in switch ONLY by declaring case blocks back to back.
                    output = "30 Days";
                    break;
                default:
                    output = "31 Days";
                    // No need for break statement here.

            }

        }
        else {output = "Invalid";}
        System.out.println("output = " + output);












    }
}
