package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        /*
        - Switch statements are faster than if statements.
        - Switch statements can NOT do everything if statements can.
        - It is not as powerful as if statement.
        if our data were char,we can name the case value as number since each char has a number!
        - Switch statements are only for == (very important).
        - Case value MUST match with switch data type and UNIQUE
        - Switch' data can not be long, float, double and boolean data types
        - Break: used for exiting the switch. if we don't give the break statement, switch statement
        continue to execute the next block(s) until the break statement or } of the switch.
        Default block gets executed if none of hte case blocks matched. prefered to be at the end.
        there is only one default block.

         */

        int number = 9;

        // 8 possible outputs 7 number of days and 8 invalid number

        // Switch statement only accepts a data that is not double, long , float nor boolean.

        /*
        Only when we are comparing the equality of the values we can use the switch statement.
        However, if there is <or> or anything other than == we CANNOT use switch statement.
        Hence, every switch statement can be done with if statement BUT not the other way around.
        If statements are so powerful, because they can accept any boolean expression.
         */


        switch (number) { // 1,2,3,4,5,6,7 for each of these data we create a case block

            case 1:
            // since the data type is int then the case value should be of the same type
                System.out.println("Monday");
                break;
            // to exit the switch so that the next block won't be executed.
            // it is not mandatory, however, if u don't add it everything fallows will be executed.
            case 2: // case value must be unique! so here we can not assign 1 again.
                System.out.println("Tuesday");
                break;
            case 3:
            // No curly braces but there should be a : colon
                System.out.println("Wednesday");
                break;
            // break is required but not mandatory.
            // break exists the switch after executing the case block.
            case 4:
                System.out.println("Thursday");
            // withing the case block we can give what ever code fragment we want.i.e. we can give any kind of if statements within!
                break;
            case 5:
                System.out.println("Friday");
                break;
            // if we didn't have the break statement, it will execute the next case
            // we will see Friday and Saturday (A bug)

            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            /*
            if we don't have a break it will keep printing every next block until it reaches a break,
             or when it reaches the closing curly braces.
             */

            default:
                // this is a special block that has no value
                // it only gets executed when the case value doesn't match any value of the cases.
                // default block can be placed anywhere in the code however it is preferred to be at the end.

                System.out.println("Invalid");
                break;
                /*
                 since the default block is at the end , here the break is not necessary
                 since we already reached the closing curly braces.
                 However, if we place the default in any other place, then break statement is necessary.
                 */

            /* we can have as many case blocks as we want depending on the scenario.
            But there should be only one default statement.
             */


        }

    }
}
