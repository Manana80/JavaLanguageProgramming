package day10_NestedIfStatement;


public class NumberIsValid {
    public static void main(String[] args) {
        int number = 4; // let's say the valid numbers are from (1 - 7)
        // 1 <=number <=7 is an allowed in math but in java, multiple arithmetic conditions are not allowed
        // hence we have to use && and || operators.

        if (number >= 1 && number <=7){ // if the number is a valid number (1~7) i.e. 7 options.

            if (number==1){
                System.out.println("Monday");
            }
            else if (number==2){
                System.out.println("Tuesday");
            }
            else if (number==3){
                System.out.println("Wednesday");
            }
            else if (number==4){
                System.out.println("Thursday");
            }
            else if (number==5){
                System.out.println("Friday");
            }
            else if (number==6){
                System.out.println("Saturday");
            }
            else{
                System.out.println("Sunday");
            }

        }

        else {
            System.out.println("Invalid Number");
        }


    }
}
